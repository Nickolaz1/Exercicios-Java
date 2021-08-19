package exercicios;

import java.util.Scanner;

public class Problema_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int BEBE = 600;
		int pet = 2000, def = 1;
		int calc;
		int n = in.nextInt();

		calc = n * BEBE;

		while (true) {
			if (calc > pet) {
				pet += 2000;
				def++;
			} else {
				break;
			}
		}

		System.out.println(def);

	}

}
