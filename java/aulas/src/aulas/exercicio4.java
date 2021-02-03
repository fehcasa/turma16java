package aulas;

import java.util.Scanner;
import java.math.*;

/*
 * Faça um programa em que permita a entrada de um número qualquer e
 * exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */


public class exercicio4 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);

		int numero;
		
		System.out.println("Digite um número qualquer");
		numero = ler.nextInt();
		
		if (numero==0)
		{
			System.out.println("O número digitado é neutro");
		}
			else if (numero %2 == 0)
				{
					System.out.printf("O numero digitado é par, e sua raíz quadrada é %.2f", Math.sqrt(numero));
				}
					else if (numero %1 == 0)
						{
							System.out.println("O número digitado é ímpar e abaixo está o número ^2\n");
							System.out.println(numero*numero);
						}
		
	}
		
}
