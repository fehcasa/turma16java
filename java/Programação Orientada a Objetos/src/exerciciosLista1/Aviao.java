package exerciciosLista1;

public class Aviao 
{
	private String marcaAviao;
	private String modeloAviao;
	private String capacidadeAviao;
	
	public Aviao (String marca, String modelo, String capacidade)
	{
		marcaAviao = marca;
		modeloAviao = modelo;
		capacidadeAviao = capacidade;
	}
	public String getmostrarMarca()
	{
		String mostrarMarca = marcaAviao;
		return mostrarMarca;
	}
	public String getmostrarModelo()
	{
		String mostrarModelo = modeloAviao;
		return mostrarModelo;
	}
	public String getmostrarCapacidade()
	{
		String mostrarCapacidade = capacidadeAviao;
		return mostrarCapacidade;
	}
}
