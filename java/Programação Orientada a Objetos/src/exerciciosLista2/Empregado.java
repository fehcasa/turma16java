package exerciciosLista2;

public class Empregado extends Pessoa 
{
	private int codSetor;
	private int salarioBase;
	private int imposto;
	
	public Empregado()
	{
		super();
	}
	
		public Empregado(String nome, String endereco, String telefone, int codSetor, int salarioBase, int imposto)
		{
		super(nome, endereco, telefone);
		//aqui novamente o super fazendo o mesmo papel//
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		}

		public int getCodSetor() {
			return codSetor;
		}

		public void setCodSetor(int codSetor) {
			this.codSetor = codSetor;
		}

		public int getSalarioBase() {
			return salarioBase;
		}
		

		public void setSalarioBase(int salarioBase) {
			this.salarioBase = salarioBase;
		}

		public int getImposto() {
			return imposto;
		}

		public void setImposto(int imposto) {
			this.imposto = imposto;
		}
		
		public int salarioFinal()
		{
			int salarioFinal = salarioBase - ((salarioBase/100)*imposto);
			return salarioFinal;
		}

}