package exemplos;

import java.util.Scanner;

import entidades.Pessoas;

public class cadAmigos
{
	public static void main (String [] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Pessoas amigo1 = new Pessoas();
		
		System.out.println("Digite seu nome: ");
		amigo1.Nome = leia.next();
		System.out.println("Digite M para masculino ou F para feminino: ");
		amigo1.Genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano do seu nascimento com 4 dígitos: ");
		amigo1.anoNascimento = leia.nextInt();
		
		System.out.printf("Olá, %s! Sua idade aproximada é %d anos!" , amigo1.Nome, amigo1.idade());
		
		
	}
}
