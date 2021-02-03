package Lista3;

import java.util.Scanner;

// Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados.

public class Exercicio5
{
	public static void main (String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int numero = 0, total = 0;
		
		System.out.println("Escreva um número");
		numero = ler.nextInt();
		
		do 
		{
			System.out.println("Escreva um número");
			numero = ler.nextInt();
			
			(numero += total);
			
			while (numero != 0);	
		}
		System.out.print("O total foi: "+total);
	}
}
