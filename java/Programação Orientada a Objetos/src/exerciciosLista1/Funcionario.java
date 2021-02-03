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
		String mostrarNome = "O nome do funcionário é: "+nomeFuncionario;
		return mostrarNome;
	}
	public String getmostrarGenero()
	{
		String mostrarGenero = "O gênero desse funcionário é: "+generoFuncionario;
		return mostrarGenero;
	}
	public String getmostrarAltura()
	{
		String mostrarAltura = "A altura desse funcionário é: "+alturaFuncionario+"m";
		return mostrarAltura;
	}
}
