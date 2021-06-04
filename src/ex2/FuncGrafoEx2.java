package ex2;

import java.util.LinkedList;
import java.util.Queue;

public class FuncGrafoEx2 {

	public void operacao(int vertices) {
		char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int m[][] = new int[vertices][vertices];
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				if (i != j) {
					m[i][j] = 1;
				} else{
					m[i][j] = 0;
				}
			}
		}
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
		
		Queue[] vetor = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
				vetor[i] = new LinkedList<String>();
		}
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				if (i != j) {
					vetor[i].add(alfabeto[j]);
				}
			}
		}
		for (int i = 0; i < vertices; i++) {
			System.out.print(alfabeto[i] + " --> " + vetor[i]);
			System.out.println();
		}
	}
}


