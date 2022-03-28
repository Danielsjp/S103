package n1exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

class Generadora {
	private static ArrayList<String> Personajes = new ArrayList<String>();
	private static HashSet<String> Personajes2 = new HashSet<String>();
	private static LinkedHashSet<String> Personajes3 = new LinkedHashSet<String>();

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

	}

	public static void seguentPersonatge() // podem accedir desde el package
	{

		int tamanio = Personajes.size();
		int tamanio2 = Personajes2.size();
		System.out.println("(Arraylist)" + Pelicula);
		for (int i = 0; i < tamanio; i++) {

			System.out.println(i + 1 + "." + Personajes.get(i));

		} // returns 1
		int i = 0;
		System.out.println("(Hashset)" + Pelicula);
		for (String nombre : Personajes2) {
			if (i < tamanio2) {
				System.out.println(i + 1 + "." + nombre);

			}
			i++;
			i = 0;
			System.out.println("(LinkedHashset)" + Pelicula);
			for (String nombre2 : Personajes3) {
				if (i < tamanio2) {
					System.out.println(i + 1 + "." + nombre2);

				}
				i++;
			}
		}
	}

	public static void main(String[] args) {
		final Generadora Pelicula1 = new Generadora("Pepito", "Gardfield");

		seguentPersonatge();
	}

}
