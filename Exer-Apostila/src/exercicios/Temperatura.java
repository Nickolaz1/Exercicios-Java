package exercicios;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		double c, f;

		System.out.println("Digite a temperatura em graus Celsius");
		c = in.nextDouble();

		f = (c * 1.8) + 32;
		System.out.println("A temperatura em graus Fahrenheit é " + f);

	}

}
