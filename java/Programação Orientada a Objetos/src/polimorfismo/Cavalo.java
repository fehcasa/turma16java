package polimorfismo;

public class Cavalo extends Animal
{
	
	public Cavalo ()
	{
		
	}
	
	public void som()
	{
		System.out.println("pooc potoc pooc potoc");
	}
	public void corre()
	{
		System.out.println("Cavalo marchando...\n");
	}
	
	public String mostraCavalo()
	{
		return "Nome do cavalo: " + nome + "\nIdade do cavalo: " + idade;
	}

}