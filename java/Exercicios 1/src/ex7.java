import java.util.Scanner;


public class ex7
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int a, b, c, d, e, f, x, y;
		
		System.out.println("Escreva o valor de a:\n");
		a = ler.nextInt();
		System.out.println("Escreva o valor de b:\n");
		b = ler.nextInt();
		System.out.println("Escreva o valor de c:\n");
		c = ler.nextInt();
		System.out.println("Escreva o valor de d:\n");
		d = ler.nextInt();
		System.out.println("Escreva o valor de e:\n");
		e = ler.nextInt();
		System.out.println("Escreva o valor de f:\n");
		f = ler.nextInt();
		
		x = (c*e)-(b*f)/(a*e)-(b*d);
		y = (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
