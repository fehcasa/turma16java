package BANK16;

public class conta
{
	private String numero;
	private String cpf;
	double saldo;
	public double valor;
	
	public conta(String numero, String cpf, double saldo)
	{
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	public String getnumero()
	{
		return numero;
	}
	public String getcpf()
	{
		return cpf;
	}
	public double getsaldo()
	{
		return saldo;
	}
	public void Debitar()
	{
		if (saldo - valor >= 0)
			System.out.println(saldo - valor);
	else 
	{
		System.out.println("Saldo insuficiente");
	}
	}
	public void Creditar()
	{
		System.out.println(saldo + valor);
	}
	
	
}