import java.util.*;
public class c1009 {
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		@SuppressWarnings("unused")
		String Nome;
		double Salario, ValorVendas;
		
		Nome = in.next();
		Salario = in.nextDouble();
		ValorVendas = in.nextDouble();
		
		ValorVendas = (ValorVendas * 15)/100;
		Salario = Salario + ValorVendas;
		
		System.out.printf("TOTAL = R$ %.2f%n",Salario);
		
	}	
}
