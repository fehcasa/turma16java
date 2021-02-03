package exerciciosLista1;

public class Aviao1_1
{
	public static void main (String args[])
	{
		Aviao aviao1 = new Aviao ("O avião é da marca LATAM","Ele é do modelo A380",
				"E possui capacidade para 300 passageiros e 12 tripulantes");
		
		System.out.println(aviao1.getmostrarMarca());
		System.out.println(aviao1.getmostrarModelo());
		System.out.println(aviao1.getmostrarCapacidade());
	}
}
