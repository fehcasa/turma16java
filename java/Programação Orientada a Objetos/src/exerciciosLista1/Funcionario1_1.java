package exerciciosLista1;

public class Funcionario1_1 
{
	public static void main (String args[])
	{
		Funcionario funcionario1 = new Funcionario ("Felipe","Masculino","1,75");
		
		System.out.println(funcionario1.getmostrarNome());
		System.out.println(funcionario1.getmostrarGenero());
		System.out.println(funcionario1.getmostrarAltura());
	}
}
