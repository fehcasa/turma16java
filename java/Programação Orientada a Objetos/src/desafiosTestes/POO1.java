package desafiosTestes;

/*
 * classe e se � publica ou n�o
 * Quando o atributo � privado, significa que somente aquela classe pode manipul�-lo
 */

public class POO1

{
//atributos da classe//
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	
	//construtor: sempre carrega o nome da classe seguido de par�metros que vao ser adicionados
	//O construtor tamb�m n�o retorna nada, ele apenar executa uma fun��o. 
	//Quem retorna � o new
	
	public POO1 (String primeiro, String segundo, String ultimo)
	{
		primeiroNome = primeiro;
		segundoNome = segundo;
		ultimoNome = ultimo;
	}
	
	//m�todo
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+segundoNome+" "+ultimoNome;
		return nomeCompleto;
	}


}
