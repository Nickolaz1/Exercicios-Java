package exercicios;

import java.util.Scanner;

public class Problema_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double l, h, a, pol;
		
		l = in.nextDouble();
		if(l <= 0 || l > 4) {
			System.exit(0);
		}
		h = in.nextDouble();
		if(h <= 0 || h > 4) {
			System.exit(0);
		}
		
		l *= 100;
		l *= l;
		h *= 100;
		h *= h;
		a = l + h;
		a = Math.sqrt(a);
		pol = a / 2.54;
		
		System.out.printf("%.0f pol%n",pol);
		
	}

}
