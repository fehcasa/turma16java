package exerciciosLista3;

import java.util.ArrayList;
import java.util.Collection;

public class Estoque
{
	public static void main(String args[])
	{
		Collection<String> estok = new ArrayList();
		estok.add("Arroz");
		estok.add("Feij�o");
		estok.add("A�ucar");
		estok.add("Sal");
		estok.add("Macarr�o");
		
		System.out.println("Meu estoque � de : "+ estok);
		
		estok.remove("A�ucar");
		
		System.out.println("\nEstoque atualizado: "+estok);
		
		for(String lista : estok)
		{
			System.out.println("\nLista do estoque: " + lista);
		}
	}

}
