package aulas;

import java.util.Scanner;
import java.math.*;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e
 * exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */


public class exercicio4 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);

		int numero;
		
		System.out.println("Digite um n�mero qualquer");
		numero = ler.nextInt();
		
		if (numero==0)
		{
			System.out.println("O n�mero digitado � neutro");
		}
			else if (numero %2 == 0)
				{
					System.out.printf("O numero digitado � par, e sua ra�z quadrada � %.2f", Math.sqrt(numero));
				}
					else if (numero %1 == 0)
						{
							System.out.println("O n�mero digitado � �mpar e abaixo est� o n�mero ^2\n");
							System.out.println(numero*numero);
						}
		
	}
		
}
