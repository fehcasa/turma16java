package exerciciosLista2;

public class Fornecedor extends Pessoa {
	private int valorCredito;
	private int valorDivida;
	private int saldoAtual;
	
		public Fornecedor()
		{
		}
		
		public Fornecedor(String nome, String endereco, String telefone, int valorCredito, int valorDivida,
		int saldoAtual) {
			
		/*
		 * Aqui, o super é utilizado para se referenciar os atributos da classe criadas anteriormente
		 * Entao super(atributos anteriores)
		 * E depois, embaixo, os valores dos novos atributos criados
		 */
			
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.saldoAtual = saldoAtual;
		
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getSaldoAtual() {
		return saldoAtual;
	}
		
	public int saldoAtual()
	{
		int saldo = valorCredito - valorDivida;
		return saldo;
	}


}

