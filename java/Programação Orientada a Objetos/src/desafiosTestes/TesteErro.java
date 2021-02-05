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
				System.out.println("Digite uma posi��o da lista: ");
				int posicao = leia.nextInt();
				System.out.println("O nome na posi��o escolhida � "+vetor[posicao]);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException erro)
			{
				System.out.println("Amig�o, tu digitou texto, deveria ter digitado um n�mero"
						+ " de 0 a 2. Ta errado!!!");
			}
			catch (Exception e)
			{
				System.out.println("Amigo, voc� digitou um texto, deveria ter digitado um n�mero de"
						+ " 0 a 2");
			}
			System.out.println("Fim de programa!!!!");
		}
		
	}
