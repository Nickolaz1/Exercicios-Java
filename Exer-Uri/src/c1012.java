import java.util.Scanner;
public class c1012 {
	public static void main (String[]args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		double vetor[] = new double[3];
		double Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
		int i;
		
		for (i=0; i<3; i++) {
			vetor[i] = in.nextDouble();
		}
		
		Triangulo = (vetor[0] * vetor[2])/2;
		Circulo = (vetor[2] * vetor[2]) * 3.14159;
		Trapezio = (vetor[0] * vetor[2])/2 + (vetor[1] * vetor[2])/2;
		Quadrado = (vetor[1] * vetor[1]);
		Retangulo = (vetor[0] * vetor[1]);
		
		System.out.printf("TRIANGULO: %.3f%n",Triangulo);
		System.out.printf("CIRCULO: %.3f%n",Circulo);
		System.out.printf("TRAPEZIO: %.3f%n",Trapezio);
		System.out.printf("QUADRADO: %.3f%n",Quadrado);
		System.out.printf("RETANGULO: %.3f%n",Retangulo);
		
	}
}
