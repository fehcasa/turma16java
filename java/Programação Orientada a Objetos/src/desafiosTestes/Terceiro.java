package desafiosTestes;

public class Terceiro extends Empregado
{
	
	private double acrescimo = 0.1;
	
	public Terceiro(String nome, int matricula, int horas, double valorHora)
	{
		super(nome, matricula, horas, valorHora);
	}
	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo)
	{
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}
	
	@Override
	public double salario()
	{
		return getHoras()*getValorHora()+(getHoras()*getValorHora()*acrescimo);
	}
	
}
