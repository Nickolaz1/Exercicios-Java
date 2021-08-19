import java.util.*;
public class c1013 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		int Vetor[] = new int [3]; 
		int i, MaiorAB, MaiorABC;
		
		for (i=0; i<3; i++) {
			Vetor[i] = in.nextInt();
		}
		
		MaiorAB = (Vetor[0] + Vetor[1] + abs(Vetor[0],Vetor[1]))/2;
		MaiorABC = (MaiorAB + Vetor[2] + abs(MaiorAB,Vetor[2]))/2;
		
		System.out.println(MaiorABC+" eh o maior");
	
	}
	
	public static int abs(int A, int B) {
		int abs;
			
			abs = A - B;
			if(abs<0) {
				abs = -(abs);
			}
			return abs;
		}

}
