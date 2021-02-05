package desafiosTestes;

import java.util.Scanner;

public class TesteErro 
{
		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			
			try
			{
				System.out.println("Digite uma sequencia de nomes:");
				String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
				System.out.println("Digite uma posição da lista: ");
				int posicao = leia.nextInt();
				System.out.println("O nome na posição escolhida é "+vetor[posicao]);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException erro)
			{
				System.out.println("Amigão, tu digitou texto, deveria ter digitado um número"
						+ " de 0 a 2. Ta errado!!!");
			}
			catch (Exception e)
			{
				System.out.println("Amigo, você digitou um texto, deveria ter digitado um número de"
						+ " 0 a 2");
			}
			System.out.println("Fim de programa!!!!");
		}
		
	}
