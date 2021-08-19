import java.util.*;
public class c1010 {
	public static void main (String[]args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		double Vetor1[] = new double [3];
		double Vetor2[] = new double [3];
		double Soma1, Soma2, Total;
		int i;
		
		for(i=0; i<3; i++){
			Vetor1[i] = in.nextDouble();
		}
		
		for(i=0; i<3; i++){
			Vetor2[i] = in.nextDouble();
		}
		
		Soma1 = Vetor1[1] * Vetor1[2];
		Soma2 = Vetor2[1] * Vetor2[2];
		Total = Soma1 + Soma2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",Total);
		
	}
}
