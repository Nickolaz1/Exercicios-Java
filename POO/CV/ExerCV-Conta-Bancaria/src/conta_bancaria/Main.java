package conta_bancaria;

import conta_bancaria.ContaBancaria;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria();
		cb.setNumConta(52);
		cb.abrirConta("CC");
		cb.setDonoConta("Nickolas Alexandre");
		cb.depositar(1550);
		cb.sacar(1600);
		cb.fecharConta();
		
		cb.estadoAtual();
		
		ContaBancaria cb2 = new ContaBancaria();
		cb2.setNumConta(35);
		cb2.setDonoConta("Julia Rozena");
		cb2.abrirConta("CP");
		
		cb2.estadoAtual();
	}

}
