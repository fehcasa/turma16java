package exerciciosLista1;

public class Funcionario 
{
	private String nomeFuncionario;
	private String generoFuncionario;
	private String alturaFuncionario;
	
	public Funcionario (String nome, String genero, String altura)
	{
		nomeFuncionario = nome;
		generoFuncionario = genero;
		alturaFuncionario = altura;
	}
	public String getmostrarNome()
	{
		String mostrarNome = "O nome do funcion�rio �: "+nomeFuncionario;
		return mostrarNome;
	}
	public String getmostrarGenero()
	{
		String mostrarGenero = "O g�nero desse funcion�rio �: "+generoFuncionario;
		return mostrarGenero;
	}
	public String getmostrarAltura()
	{
		String mostrarAltura = "A altura desse funcion�rio �: "+alturaFuncionario+"m";
		return mostrarAltura;
	}
}
