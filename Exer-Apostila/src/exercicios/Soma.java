package exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int v1, v2, resultado;

		System.out.println("Digite o primeiro valor");
		v1 = in.nextInt();

		System.out.println("Digite o segundo valor");
		v2 = in.nextInt();

		resultado = v1 + v2;
		System.out.println("O resultado é " + resultado);

	}

}
