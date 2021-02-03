package aulas;

import java.util.Scanner;

public class desafioProgramadores
{
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Escreva um número, direi se é par ou ímpar:");
		numero = ler.nextInt();
		
		if (numero==0)
		{
			System.out.println("O número digitado é neutro");
		}
			else if (numero %2 == 0)
				{
					System.out.println("O número digitado é par");
				}
					else (numero %1 == 0)
						{
							System.out.println("O número digitado é ímpar");
						}
		}
		
		
		{
		
		
	}
		
}


