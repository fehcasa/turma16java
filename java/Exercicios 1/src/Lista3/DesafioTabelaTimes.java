package Lista3;

/*
 * //PAULISTINHA
		// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
		// PONTOS - INTEIRO - 4
		// GANHA - 3 PONTOS
		// PERDE - 0 PONTO
		// EMPATA - 1 PONTO
		// FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME G-GANHOU, P-PERDEU
		// OU EMPATOU  EM 4 RODADAS, AO FINAL MOSTRA O NOME DE CADA TIME
		// E SEUS RESPECTIVOS PONTOS
		//CORINTHIANS - G-ganhou P-perdeu ou E-empatou [G/P/E]:
 */

import java.util.Scanner;

public class DesafioTabelaTimes
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		
		String times [] = {"Corinthians", "São Paulo", "Santos", "Palmeiras"};
		int pontos [];
		int resposta;
		
		for (int x = 0; x<4; x++)
		{
			System.out.println("Rodada nº: "+(x+1)+"\n");
			for (int y = 0; y<4; y++)
			{
				System.out.println(times[y]+"O time ganhou, empatou ou perdeu (G/E/P)? ");
				resposta = ler.nextInt();
				
			}
		}
		
		
		
		
	}

}
