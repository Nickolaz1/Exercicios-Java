package exercicios;

import java.util.Scanner;

public class Volume {
	// Volume --> classe

	public Volume(double raio, double h) {
		// TODO Auto-generated constructor stub

		double VALOR_PI = 3.14;
		double v = VALOR_PI * (raio * raio) * h;

		System.out.println("O Volume é " + v);
	}

	public static void main(String[] args) {
		// main --> metodo/função
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// Scanner --> tipo, in --> objeto
		// atributos do metodo Scanner podem ser acessados pelo objeto do tipo Scanner

		double raio, h;

		System.out.println("Digite o valor do raio");
		raio = in.nextInt();

		System.out.println("Digite o valor da altura");
		h = in.nextInt();

		new Volume(raio, h);

	}

}
