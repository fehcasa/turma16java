package entidades;

import java.sql.Date;

public class Pessoas
{
	public String Nome;
	public char Genero;
	public int anoNascimento;
	public String mensagem;
	
	public int idade ()
	{
		return 2021 - anoNascimento;
	}
	{
		if (idade() < 18)
			{
				System.out.println("Você é menor de idade. Só pode comprar gibis da Turma da Mônica.");
			}
		else
			{
				System.out.println("Você é maior de idade. Compre o que quiser, desde que pague.");
			}
	}
		
		
}
	