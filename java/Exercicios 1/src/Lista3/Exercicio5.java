package Lista3;

import java.util.Scanner;

// Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
//No final, mostre a soma dos n�meros digitados.

public class Exercicio5
{
	public static void main (String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int numero = 0, total = 0;
		
		System.out.println("Escreva um n�mero");
		numero = ler.nextInt();
		
		do 
		{
			System.out.println("Escreva um n�mero");
			numero = ler.nextInt();
			
			(numero += total);
			
			while (numero != 0);	
		}
		System.out.print("O total foi: "+total);
	}
}
