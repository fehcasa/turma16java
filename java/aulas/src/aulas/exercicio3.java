package aulas;

import java.util.Scanner;

//10-14 infantil
//15-17 juvenil
//18-25 adulto

public class exercicio3 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Olá, digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 10 || idade > 25)
		{
			System.out.println("Sua idade está fora das categorias.");
		}
		else if (idade <= 14)
		{
			System.out.println("Sua categoria é infantil.");
		}
		else if (idade <= 17)
		{
			System.out.println("Sua categoria é juvenil.");
		}
		else if (idade <= 25)
		{
			System.out.println("Sua categoria é adulto.");
		}
		
	}
}
