package n1exercici6;
import java.util.LinkedList;
import java.util.Random;

public class Principal {
	
	static Random rand = new Random();
	static int rando;
	public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	System.out.println(list);
	int tamanio = list.size();
	int i = 0;
	while (tamanio%2==0 && i<=list.size()) {
		int mitad = tamanio/2;
		//int int_random = rand.nextInt(rando); 
		//list.add(tamanio/2, 9);
		//System.out.println(int_random);
		System.out.println("Hola");
		System.out.println(mitad);
		i++;
	}
	
}
}
