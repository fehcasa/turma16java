import java.util.Scanner;

public class ex5
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int nota1, nota2, nota3, resultado, media;
		
		System.out.println("Escreva a primeira nota:\n");
		nota1 = ler.nextInt();
		System.out.println("\nEscreva a segunda nota:\n");
		nota2 = ler.nextInt();
		System.out.println("\nEscreva  terceira nota;\n");
		nota3 = ler.nextInt();
		
		resultado = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		
		media = resultado/10; 
		
		System.out.println(media); 
		
	}
}
