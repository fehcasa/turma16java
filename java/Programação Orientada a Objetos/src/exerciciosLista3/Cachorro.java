package exerciciosLista3;

public class Cachorro extends Animal
{
	
	public Cachorro()
	{
		super();
	}
	
	public void som()
	{
		System.out.println("AU AU AU AU AU GRRR");
	}
	public void corre()
	{
		System.out.println("Cachorro correndo...\n");
	}
	
	public String mostraCachorro()
	{
		return "Nome cachorro: " + nome + "\nIdade do cachorro: " + idade;
	}

}
