package Lista3;

import java.util.Scanner;
import java.util.Locale;

public class CalcularTriangulo 
{

	public static void main(String[] args)
	{		
			Locale.setDefault(Locale.US); //define o tipo de padronização
				//area = base * altura / 2
				Scanner leia = new Scanner(System.in);//instaciar = criar
				double base1, altura1, area1, base2, altura2, area2, base3, altura3, area3, maior = 0;
				
				System.out.println("Digite a base do triangulo: ");
				base1 = leia.nextDouble();
				System.out.println("Digite a altura do triangulo: ");
				altura1 = leia.nextDouble();
				
				area1 = ((base1 * altura1) / 2 );
				
				System.out.printf("A area do triangulo informado é %.2f", area1,"\n");
				
				System.out.println("Digite a base do triangulo: ");
				base2 = leia.nextDouble();
				System.out.println("Digite a altura do triangulo: ");
				altura2 = leia.nextDouble();
				
				area2 = ((base2 * altura2) / 2 );
				
				System.out.printf("A area do triangulo informado é %.2f", area2,"\n");
				
				System.out.println("Digite a base do triangulo: ");
				base3 = leia.nextDouble();
				System.out.println("Digite a altura do triangulo: ");
				altura3 = leia.nextDouble();
				
				area3 = ((base3 * altura3) / 2 );
				
				System.out.printf("A area do triangulo informado é %.2f", area3,"\n");
				
				for(int i=0;i<3;i++)
				{
					if(area1>maior) {
						area1 = maior; 
					}else if(area2>maior) {
						area2 = maior;
					}else if(area3>maior) {
						area3 = maior;
					}
						
					System.out.printf("A maior área de triangulo é: " ,maior);
				}

				

			}

		
	}

