/*
 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  
 * de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 */


public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que pegue um n�mero do teclado e calcule 
		 * a soma de todos os n�meros  de 1 at� ele. 
		 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		 */
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0, i = 1;
		System.out.print("Digite um numero: ");
		numero = ler.nextInt();
		
		
		do {
			soma += i;
			i++;
		}while(i <= numero);
		System.out.println(soma);
