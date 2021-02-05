package desafiosTestes;

import java.util.Locale;
import java.util.Scanner;
import Interface_Polimorfismo.Empregado;
import Interface_Polimorfismo.Terceiro;
import java.util.ArrayList;
import java.util.List;
public class MainFuncionarios {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Você é Terceiro? ");
		char opcao = leia.next().toUpperCase().charAt(0);
	 	if(opcao == 'S') {
		List <Empregado> lista = new ArrayList<>();
		System.out.println("Informe matricula: ");
		int matricula = leia.nextInt();
		System.out.println("informe seu nome: ");
		String nome = leia.next();
		System.out.println("Horas trabalhadas: ");
		int horas = leia.nextInt();
		System.out.println("Valor por horas trabalhadas: ");
		
		System.out.println("Digite o valor de acrescimo: ");
 		double acrescimo = leia.nextDouble();
 		Empregado func1 = new Terceiro(nome,matricula,horas,valorHora);
 		
 		System.out.println("Matricula:"+ func1.getMatricula());
 		System.out.println("Nome:"+ func1.getNome());
 		System.out.println("Salário:"+ func1.salario());
		
	 	}
	}
}
