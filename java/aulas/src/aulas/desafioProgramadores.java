package aulas;

import java.util.Scanner;

public class desafioProgramadores
{
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Escreva um n�mero, direi se � par ou �mpar:");
		numero = ler.nextInt();
		
		if (numero==0)
		{
			System.out.println("O n�mero digitado � neutro");
		}
			else if (numero %2 == 0)
				{
					System.out.println("O n�mero digitado � par");
				}
					else (numero %1 == 0)
						{
							System.out.println("O n�mero digitado � �mpar");
						}
		}
		
		
		{
		
		
	}
		
}


