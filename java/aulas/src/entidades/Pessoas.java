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
				System.out.println("Voc� � menor de idade. S� pode comprar gibis da Turma da M�nica.");
			}
		else
			{
				System.out.println("Voc� � maior de idade. Compre o que quiser, desde que pague.");
			}
	}
		
		
}
	