package exercicios;

import java.util.Scanner;

public class Problema_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int intervalo = 210;
		int i, cont = 0, s = 1;
		int n = in.nextInt();
		int ep[] = new int[n];

		for (i = 0; i < n; i++) {
			ep[i] = in.nextInt();
			if (ep[i] <= 0 || ep[i] > 120) {
				System.exit(0);
			}
			cont += ep[i];
		}

		while (true) {
			if (cont > intervalo) {
				intervalo += 210;
				s++;
			} else {
				break;
			}
		}

		System.out.println(s + "sem");

	}

}
