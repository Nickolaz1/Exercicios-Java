import java.util.Scanner;

public class c1021 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int n, i, x, a, conv;
		int vetorNota[] = new int[6], contNota[] = {100, 50, 20, 10, 5, 2};
		int vetorMoeda[] = new int[6], contMoeda[] = {100, 50, 25, 10, 5, 1}; 
		double valor, contMoeda2[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		String sl, output[];
		
		valor = in.nextDouble();
		n = (int)valor;
			
		for(i=0; i<6; i++) {
			x = n;
			a = n/contNota[i];
			vetorNota[i] = a; 
			n = x%contNota[i]; 
		}
		
		sl = String.valueOf(valor);
		//output = sl.split(Pattern.quote(".")); faz a msm coisa da linha debaixo
		output = sl.split("\\.");
		output[0] = String.valueOf(n);
		output[0] += output[1];
		conv = Integer.parseInt(output[0]);
		
		for(i=0; i<6; i++) {
			x = conv;
			a = conv/contMoeda[i];
			vetorMoeda[i] = a; 
			conv= x%contMoeda[i]; 
		}
		
		System.out.println("NOTAS:");
		for(i=0; i<6; i++) {
			System.out.println(vetorNota[i] + " nota(s) de R$ " + contNota[i] + ".00");
		}
		
		System.out.println("MOEDAS:");
		for(i=0; i<6; i++) {
			System.out.printf("%d moeda(s) de R$ %.2f\n", vetorMoeda[i], contMoeda2[i]);
		}
	}
}
