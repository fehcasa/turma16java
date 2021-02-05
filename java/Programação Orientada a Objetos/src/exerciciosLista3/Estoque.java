package exerciciosLista3;

import java.util.ArrayList;
import java.util.Collection;

public class Estoque
{
	public static void main(String args[])
	{
		Collection<String> estok = new ArrayList();
		estok.add("Arroz");
		estok.add("Feijão");
		estok.add("Açucar");
		estok.add("Sal");
		estok.add("Macarrão");
		
		System.out.println("Meu estoque é de : "+ estok);
		
		estok.remove("Açucar");
		
		System.out.println("\nEstoque atualizado: "+estok);
		
		for(String lista : estok)
		{
			System.out.println("\nLista do estoque: " + lista);
		}
	}

}
