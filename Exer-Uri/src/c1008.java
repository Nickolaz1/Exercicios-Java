import java.util.*;
public class c1008 {
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int Nfuncionario, HorasTrab;
		double ValorHora,Salario;
		
		Nfuncionario = in.nextInt();
		HorasTrab = in.nextInt();
		ValorHora = in.nextDouble();
		Salario = HorasTrab * ValorHora;
		
		System.out.printf("NUMBER = "+Nfuncionario+"%nSALARY = U$ %.2f%n",Salario);
		
	}	
}
