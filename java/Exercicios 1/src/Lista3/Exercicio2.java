package Lista3;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Exercicio2

{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int numero, pares = 0, impares = 0;
		
		for (int x = 0; x < 10; x++)
		{
			System.out.println("Escreva um número: \n");
			numero = ler.nextInt();
			
			if (numero % 2 == 0);
			{
				pares++;
			}
			else if (numero % 1 == 0);
			{
				impares++;
			}
		}
		
		System.out.println("Temos " + pares + " numeros pares");
        System.out.println("Temos " + impares + " numeros impares");
		
	}
		
}
