package exercicios;

import java.util.Scanner;

public class Problema_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int vetorA[] = new int[5], defa[] = new int[5];
		int vetorT[] = new int[5], deft[] = new int[5];
		String vetor[] = new String[5];
		int n = 0, l = 0, cont = 0, x = 0, y = 0, i, j;
		int matriz[][] = new int[10][5];

		while (true) {

			if (cont >= 5) {
				break;
			}

			System.out.println("Digite o nome da equipe");
			String nome = in.next();

			System.out.println("Digite os acertos[1] ou os erros [0]");
			for (i = 0; i < 5; i++) {
				vetorA[i] = in.nextInt();
				if (vetorA[i] < 0 || vetorA[i] > 1) {
					System.exit(0);
				}
			}

			System.out.println("Digite o tempo para resolução");
			for (i = 0; i < 5; i++) {
				vetorT[i] = in.nextInt();
				if (vetorT[i] < 0 || vetorT[i] > 100) {
					System.exit(0);
				}
			}

			while (true) {
				vetor[l] = nome;
				l++;
				break;
			}

			for (n = 0; n < 10; n++) {
				for (j = 0; j < 5; j++) {
					if (n % 2 == 0) {
						matriz[n][j] = vetorA[j];
						defa[x] += matriz[n][j];
					} else {
						matriz[n][j] = vetorT[j];
						deft[y] += matriz[n][j];
					}
				}
				if (n % 2 == 0) {
					x++;
				} else {
					y++;
				}
				if (n == 1 || n == 3 || n == 5 || n == 7) {
					break;
				}
			}

			cont++;
		}

		x = 0;
		y = 0;
		l = 0;
		cont = 0;

		while (true) {

			if (cont >= 5) {
				break;
			}

			while (true) {
				System.out.print((l+1) + " - " + vetor[l] + " ");
				l++;
				break;
			}

			while (true) {
				System.out.println("Acertos = " + defa[x] + " Tempo = " + deft[y]);
				x++;
				y++;
				break;
			}

			cont++;
		}

	}

}
