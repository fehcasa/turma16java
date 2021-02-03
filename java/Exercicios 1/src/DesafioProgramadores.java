/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o 
 * sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.

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
			System.out.println("Por favor, digite seu sal�rio: \n");
			salario = ler.nextDouble();
			
			System.out.println("Por favor, digite quantos filhos voc� tem: \n");
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
		
		System.out.printf("A m�dia de sal�rios � R$%.2f", mediaSalario);
		
		System.out.printf("\nA m�dia de filhos � %.2f", mediaFilhos);
		
		System.out.printf("\nO maior sal�rio � %.2f", maiorSalario);
		
		
				
	
	}
	
}
