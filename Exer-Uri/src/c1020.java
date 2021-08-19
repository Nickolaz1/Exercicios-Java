import java.util.Scanner;
public class c1020 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dia, ano, mes;
		
		dia = in.nextInt();
		ano = dia/365;
		mes = (dia%365)/30;
		dia = (dia%365)%30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}
}
