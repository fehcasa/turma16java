package desafiosTestes;

/*
 * classe e se é publica ou não
 * Quando o atributo é privado, significa que somente aquela classe pode manipulá-lo
 */

public class POO1

{
//atributos da classe//
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	
	//construtor: sempre carrega o nome da classe seguido de parâmetros que vao ser adicionados
	//O construtor também não retorna nada, ele apenar executa uma função. 
	//Quem retorna é o new
	
	public POO1 (String primeiro, String segundo, String ultimo)
	{
		primeiroNome = primeiro;
		segundoNome = segundo;
		ultimoNome = ultimo;
	}
	
	//método
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+segundoNome+" "+ultimoNome;
		return nomeCompleto;
	}


}
