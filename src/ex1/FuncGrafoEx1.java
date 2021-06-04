package ex1;

import java.util.LinkedList;
import java.util.Queue;

public class FuncGrafoEx1 {
	public void responda(int m[][]) {
		String respDi = "";
		String respCo = "";
		String respAc = "";
		int grau[] = new int[m.length];
		char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != 0) {
					System.out.println("Aresta " + alfabeto[i] + " " + alfabeto[j]);
					grau[i]++;
					if (!respDi.equals("não direcionado")) {
						if (m[j][i] != 0) {
							respDi = "não direcionado";
						} else {
							respDi = "dígrafo";
						}
					}
				}
			}
		}

		System.out.println("O Grafo é " + respDi);

		int aux[] = new int[m.length];
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (!respCo.equals("desconexo")) {
					if (m[i][j] != 0) {
						aux[j] = m[i][j];
					}
					if (j == m.length - 1) {
						for (int k = 0; k < m[0].length; k++) {
							if (k == 0) {
								respCo = "desconexo";
							}
							if (aux[i + 1] != 0) {
								respCo = "conexo";
							}
						}
					}
				}
			}
		}

		System.out.println("O Grafo é " + respCo);
		int soma = 0;
		for (int i = 0; i < m.length; i++) {
			System.out.println("Vértice " + alfabeto[i] + " tem grau " + grau[i]);
			soma += grau[i];
		}

		if ((!respCo.equals("desconexo")) && (m[m.length - 1][0] != 0) && (soma >= 2)) {
			respAc = "ciclico";
		} else {
			respAc = "aciclico";
		}

		System.out.println("O Grafo é " + respAc);

		Queue[] vetor = new LinkedList[m.length];
		for (int i = 0; i < m.length; i++) {
			vetor[i] = new LinkedList<String>();
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] != 0) {
					vetor[i].add(alfabeto[j]);
				}
			}
		}
		for (int i = 0; i < m.length; i++) {
			System.out.print(alfabeto[i] + " --> " + vetor[i]);
			System.out.println();
		}
	}
}


