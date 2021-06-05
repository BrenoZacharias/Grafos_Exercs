package ex1;

public class MainEx1 {

	public static void main(String[] args) {

		FuncGrafoEx1 f = new FuncGrafoEx1();
		int m[][] = { { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0 } };
		int m2[][] = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };
		int m3[][] = { { 0, 1 }, { 1, 0 } };
		int m4[][] = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 0, 1, 0, 0 } };
		int m5[][] = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } };
		System.out.println(f.responda(m));
		System.out.println(f.responda(m2));
		System.out.println(f.responda(m3));
		System.out.println(f.responda(m4));
		System.out.println(f.responda(m5));
	}
}
