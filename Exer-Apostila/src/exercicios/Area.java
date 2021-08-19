package exercicios;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double VALOR_PI = 3.14;
		double raio, area;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o valor de raio");
		raio = in.nextDouble();

		area = VALOR_PI * (raio * raio);
		System.out.println("O valor da area é " + area);

	}

}
