package exerciciosLista1;

public class ProdutoEletronico 
{
	private String tipoProduto;
	private String marcaProduto;
	private String modeloProduto;
	
	public ProdutoEletronico (String tipo, String marca, String modelo)
	{
		tipoProduto = tipo;
		marcaProduto = marca;
		modeloProduto = modelo;		
	}
	public String getmostrarTipo()
	{
		String mostrarTipo = "O tipo do aparelho eletr�nico �: " + tipoProduto;
		return mostrarTipo;
	}
	public String getmostrarMarca()
	{
		String mostrarMarca = "A marca desse "+tipoProduto+" �: " + marcaProduto;
		return mostrarMarca;
	}
	public String getmostrarModelo()
	{
		String mostrarModelo = "O modelo do "+tipoProduto+" � " + modeloProduto;
		return mostrarModelo;
	}
	
}
