import java.util.Arrays;

public class metodoString {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "nickolas é legal";
		String compare = "nick";
		int i;
		
		//charAt serve para acessar qualquer caracter de uma String 
		for(i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//getChars extrai caracteres de uma String e coloca em um array de char
		char [] nick = new char [nome.length()];
		nome.getChars(0, 4, nick, 0);
		System.out.println(nick);
		
		//getBytes extrai caracteres de uma String e coloca em um array de byte
		//Array.toString() transforma arrays em Strings
		byte [] nomeBytes = new byte [nome.length()];
		nome.getBytes(0, nome.length(), nomeBytes, 0);
		System.out.println(Arrays.toString(nomeBytes));
		
		//criar um array de char e colocar cada caracter de uma String
		//como um indice dentro desse array
		char [] nomeChars = nome.toCharArray();
		System.out.println(nomeChars);
		
		//compara uma região da String com outra String
		System.out.println(nome.regionMatches(0, compare, 0, 3));

	}

}
