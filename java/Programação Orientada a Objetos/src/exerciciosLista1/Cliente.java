package exerciciosLista1;

public class Cliente 
{
	private String nomeCliente;
	private int cpfCliente;
	
	public Cliente (String nome, int cpf)
	{
		nomeCliente = nome;
		cpfCliente = cpf;
	}
	
	public String getmostrarNome()
	{
		String mostrarNome = "O nome do cliente �: " + nomeCliente;
		return mostrarNome;
	}
	
	public String getmostrarCPF()
	{
		String mostrarCPF = "O CPF do cliente �: " + cpfCliente;
		return mostrarCPF;
		
	}
	
}
