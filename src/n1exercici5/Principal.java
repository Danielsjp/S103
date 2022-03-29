package n1exercici5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Lista1 = new ArrayList<String>();
		ArrayList<String> ListaInvertida=new ArrayList<String>();
		Lista1.add("Geeks");
		Lista1.add("for");
		Lista1.add("Geeks");
		Lista1.add("is");
		Lista1.add("a");
		Lista1.add("CS");
		Lista1.add("Students");
		Lista1.add("Portal");
		int tam = Lista1.size();
		Iterator<String> iter = Lista1.iterator();
		System.out.println("\nThe iterator values(ORIGINAL)" + " of Arraylist are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next().toString() + " ");
			
		}
		Collections.reverse(Lista1);
		for (String item : Lista1) {
			ListaInvertida.add(item);
		}
		Iterator<String> iter2 = ListaInvertida.iterator();
		System.out.println("\nMETHOD1#The iterator values(inverted)" + " of Arraylist are: ");
		while (iter2.hasNext()) {
			System.out.print(iter2.next().toString() + " ");
			
		}
		// Arraylist for storing reversed elements
        ArrayList<String> ListaInvertida2 = new ArrayList<String>();
        for (int i = Lista1.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
        	ListaInvertida2.add(Lista1.get(i));
        }
        Iterator<String> iter3 = ListaInvertida2.iterator();
        System.out.println("\nMETHOD2#The iterator values(reversed)" + " of Arraylist are: ");
		while (iter3.hasNext()) {
			System.out.print(iter3.next().toString() + " ");
			
		}
        // Return the reversed arraylist
 
    }
	}
		



