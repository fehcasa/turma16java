package Lista3;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99
 */

public class Exercicio3 
{

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int idade; 
		
		System.out.println("Escreva sua idade: \n");
		idade = ler.nextInt();
		
		while (idade <99)
		{
			if (idade < 21)
			{
				idade ++;
			}
			if  (idade > 50)
			{
				idade ++;
			}
			
			System.out.println("O total de idades abaixo de 21 anos foi: "+idade);
			System.out.println("O total de idades acima de 50 anos foi: "+idade);
		}
		
	
	}

}
