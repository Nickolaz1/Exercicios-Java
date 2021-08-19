package exercicios;

import java.util.Scanner;

public class Problema_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int i = 0;

		String a = in.nextLine().toLowerCase();
		if (a.length() <= 0 || a.length() > 500) {
			System.exit(0);
		}
		String b = in.nextLine().toLowerCase();
		if (b.length() <= 0 || b.length() > 500) {
			System.exit(0);
		}

		if (a.split(" ").length == b.split(" ").length) {
			String[] frase = b.split(" ");
			for (String palavras : frase) {
				if (a.contains(palavras)) {
					continue;
				} else {
					i++;
					break;
				}
			}
		} else {
			i++;
		}

		if (i == 0) {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		}

	}

}
