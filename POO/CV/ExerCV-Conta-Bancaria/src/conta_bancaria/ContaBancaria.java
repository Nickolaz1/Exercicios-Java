package conta_bancaria;

public class ContaBancaria {
	
	public int numConta;
	protected String tipoConta;
	private String donoConta;
	private float saldo;
	private boolean statusConta;
	
	public ContaBancaria() {
		this.setStatusConta(false);
		this.setSaldo(0);
	}
	
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getDonoConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Conta: " + this.getStatusConta());
	}
	
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatusConta(true);
		if(this.getTipoConta().equalsIgnoreCase("cc")) {
			this.setSaldo(50);
		}
		else {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Dinheiro na conta");
		}
		else if(this.getSaldo() < 0) {
			System.out.println("Conta em debito");
		}
		else {
			this.setStatusConta(false);
		}
	}
	
	public void sacar(int v) {
		if(this.getStatusConta()) {
			if(this.getSaldo() < v) {
				System.out.println("Saldo insuficiente");
			}
			else {
				this.setSaldo(this.getSaldo()-v);
			}
		}
		else {
			System.out.println("Conta inativa");
		}
	}
	
	public void depositar(int v) {
		if(this.getStatusConta()) {
			this.setSaldo(this.getSaldo()+v);
		}
		else {
			
		}
	}
	
	public void mensalidadeConta() {
		float v;
		if(this.getTipoConta().equalsIgnoreCase("cc")) {
			v = 12;
		}
		else {
			v = 20;
		}
		if(this.getStatusConta()) {
			if(this.getSaldo() > v) {
				this.setSaldo(getSaldo()-v);
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Conta inativa");
		}
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
}
