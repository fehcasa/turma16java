import java.util.Scanner;

public class ex4
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int A, B, C, R, S, D, resultado;
		System.out.println("Escreva o valor de A:\n");
		A = ler.nextInt();
		System.out.println("Escreva o valor de B:\n");
		B = ler.nextInt();
		System.out.println("Escreva o valor de C;\n");
		C = ler.nextInt();
		
		R = (A+B) + (A+B);
		S = (B+C) + (B+C);
		
		D = (R+S)/2; 
		
		System.out.println(D);
				
	}
}
