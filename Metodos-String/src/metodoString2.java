import java.util.Scanner;

public class metodoString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um nome");
		String s = in.nextLine();
		
		//deixar a primeira letra maiuscula
		s = s.toUpperCase().charAt(0) + s.substring(1, s.length());
		
		System.out.println(s);
		
		System.out.println("Digite uma frase");
		String a = in.nextLine().toLowerCase();

		System.out.println("Digite outra frase");
		String b = in.nextLine().toLowerCase();
		
		//contains verifica se a palavra ou letra esta contida em uma outra String
		if(a.contains(b)) {
			System.out.println("As frases são iguais");
		}
		else {
			System.out.println("Não sao iguais");
		}

	}

}
