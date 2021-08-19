import java.util.Scanner;
public class c1018 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n, x, i, z;
		int vetor[] = new int[7], cont[] = {100, 50, 20, 10, 5, 2, 1};	
		n = in.nextInt();
		z = n;	
		for(i=0; i<7; i++) {
			x = n;
			int a = n/cont[i];
			vetor[i] = a; 
			n = x%cont[i]; 
		}	
		System.out.println(z);
		for(i=0; i<7; i++) {
			System.out.println(vetor[i] + " nota(s) de R$ " + cont[i] + ",00");
		}
	}
}
