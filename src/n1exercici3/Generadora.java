package n1exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Generadora {
	private static ArrayList<String> Personajes = new ArrayList<String>();
	private static HashSet<String> Personajes2 = new HashSet<String>();
	private static LinkedHashSet<String> Personajes3 = new LinkedHashSet<String>();
	private static TreeSet<String> Personajes4 = new TreeSet<String>();

	private String Personaje1;
	private String Personaje2;
	private static String Pelicula = "Piratas del Caribe: ";

	private Generadora(String Personaje1, String Personaje2) {
		this.Personaje1 = Personaje1;
		this.Personaje2 = Personaje2;

		Personajes.add(Personaje1);
		Personajes.add(Personaje2);
		
		Personajes2.add(Personaje1);
		Personajes2.add(Personaje2);
		
		Personajes3.add(Personaje1);
		Personajes3.add(Personaje2);
		
		Personajes4.add(Personaje1);
		Personajes4.add(Personaje2);

	}

	public static void seguentPersonatge() // podem accedir desde el package
	{
		
		int tamanio = Personajes.size();
		System.out.println("(1.Arraylist)" + Pelicula);
		for (int i = 0; i < tamanio; i++) 
		{

			System.out.println(Personajes.get(i));

		}
		System.out.println("(2.Hashset)" + Pelicula);
		for (String nombre : Personajes2) {
			int y=0;
			if (y < tamanio) 
			{
				System.out.println(nombre);
				y++;
			}}
		System.out.println("(3.LinkedHashset)" + Pelicula);
		for (String nombre2 : Personajes3) 
		{
			int p=0;
			if (p < tamanio) {
				System.out.println(nombre2);
				p++;
			}}
		System.out.println("(4.Treeset)" + Pelicula);
		for (String nombre4 : Personajes4) 
		{
			int r=0;
			if (r < tamanio) {
				System.out.println(nombre4);
				r++;}
			}
		
	}

	public static void main(String[] args) {
		final Generadora Pelicula1 = new Generadora("Pepito", "Gardfield");

		seguentPersonatge();
	}

}
