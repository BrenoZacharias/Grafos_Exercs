package ex1;

import java.util.LinkedList;
import java.util.Queue;

public class FuncGrafoEx1 {

	private final char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private String respDi = "";
	private String respCo = "";
	private String respAc = "";
	private int m[][];
	private int grau[];
	StringBuffer buffer;

	public StringBuffer responda(int m[][]) {
		buffer = new StringBuffer();
		this.m = m;
		grau = new int[m.length];
		AeB();
		CeE(D());
		F();
		return buffer;
	}

	private void AeB() {
		String respDi = "";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != 0) {
					buffer.append("Aresta " + alfabeto[i] + " " + alfabeto[j] + "\n");
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
		buffer.append("O grafo é " + respDi + "\n");
	}

	private String D() {
		String respCo = "";
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
		buffer.append("O grafo é " + respCo + "\n");
		return respCo;
	}

	private void CeE(String RespCo) {
		respCo = RespCo;
		String respAc = "";
		int soma = 0;
		for (int i = 0; i < m.length; i++) {
			buffer.append("Vértice " + alfabeto[i] + " tem grau " + grau[i] + "\n");
			soma += grau[i];
		}

		if ((respCo.equals("conexo")) && (m[m.length - 1][0] != 0) && (soma >= 2)) {
			respAc = "ciclico";
		} else {
			respAc = "aciclico";
		}
		buffer.append("O grafo é " + respAc + "\n");
	}

	private void F() {
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
			buffer.append(alfabeto[i] + " --> " + vetor[i] + "\n");
		}
	}
}
