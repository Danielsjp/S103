package n1exercici6;
import java.util.LinkedList;
import java.util.Random;

public class Principal {
	
	static int rand = new Random().nextInt(10);;
	public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	int tamanio = list.size();
	if (tamanio%2==0) {
		int mitad = tamanio/2;
		//int int_random = rand.nextInt(rando); 
		//list.add(tamanio/2, 9);
		//System.out.println(int_random);
		list.add(mitad, rand);
		System.out.println(list);
	}
	
}
}
