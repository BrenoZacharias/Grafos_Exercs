package ex2;

import java.util.LinkedList;
import java.util.Queue;

public class FuncGrafoEx2 {

	final char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	int m[][];
	int vertices;
	Queue[] vetor;

	public void operacao(int vertices) {
		this.vertices = vertices;
		m = new int[vertices][vertices];
		vetor = new LinkedList[vertices];
		prencherMatriz();
		mostrarMatriz();
		inicializaListas();
		addNasListas();
		mostraListas();
	}

	public void prencherMatriz() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (i != j) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
			}
		}
	}

	public void mostrarMatriz() {
		int c = 0;
		while (c < vertices) {
			System.out.print("   " + alfabeto[c]);
			c++;
		}
		System.out.println();
		for (int i = 0; i < vertices; i++) {
			System.out.print(alfabeto[i]);
			for (int j = 0; j < vertices; j++) {
				System.out.print(" [" + m[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void inicializaListas() {
		for (int i = 0; i < vertices; i++) {
			vetor[i] = new LinkedList<String>();
		}
	}

	public void addNasListas() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				if (i != j) {
					vetor[i].add(alfabeto[j]);
				}
			}
		}
	}

	public void mostraListas() {
		for (int i = 0; i < vertices; i++) {
			System.out.print(alfabeto[i] + " --> " + vetor[i]);
			System.out.println();
		}
	}
}
