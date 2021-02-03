package exerciciosLista1;

public class Patinete 
{
	private String alturaPatinete;
	private String corPatinete;
	private String materialPatinete;
	
	public Patinete (String altura, String cor, String material)
	{
		alturaPatinete = altura;
		corPatinete = cor;
		materialPatinete = material;
	}
	public String getmostrarAltura()
	{
		String mostrarAltura = "A altura do patinete é: "+alturaPatinete;
		return mostrarAltura;
	}
	public String getmostrarCor()
	{
		String mostrarCor = "A cor desse patinete é: "+corPatinete;
		return mostrarCor;
	}
	public String getmostrarMaterial()
	{
		String mostrarMaterial = "O patinete é feito de: "+materialPatinete;
		return mostrarMaterial;
	}
}

