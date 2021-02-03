/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o 
 * salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.

 */

import java.util.Scanner;

public class DesafioProgramadores

{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		double salario, totalSalario = 0, mediaFilhos, mediaSalario, maiorSalario = 0, percentual;
		int filhos, totalFilhos = 0, contador = 0, habitantes = 0;
		
		for (int x = 0; x < 3; x++)
		{
			System.out.println("Por favor, digite seu salário: \n");
			salario = ler.nextDouble();
			
			System.out.println("Por favor, digite quantos filhos você tem: \n");
			filhos = ler.nextInt();
			
			totalSalario += salario; 
			
			totalFilhos += filhos; 
			
			if (salario > maiorSalario) 
			{
				maiorSalario = salario;
			}
			if (salario < 100)
			{
				contador++;
			}
		
		}
		
		mediaFilhos = totalFilhos/3;
		
		mediaSalario = totalSalario/3;
		
		System.out.printf("A média de salários é R$%.2f", mediaSalario);
		
		System.out.printf("\nA média de filhos é %.2f", mediaFilhos);
		
		System.out.printf("\nO maior salário é %.2f", maiorSalario);
		
		
				
	
	}
	
}
