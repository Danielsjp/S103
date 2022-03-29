package n1exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> Lista1 = new ArrayList<String>();
		HashSet<String> Lista2 = new HashSet<String>();
		LinkedHashSet<String> Lista3 = new LinkedHashSet<String>();
		TreeSet<String> Lista4 = new TreeSet<String>();
		
		Lista1.add("Geeks");
		Lista1.add("for");
		Lista1.add("Geeks");
		Lista1.add("is");
		Lista1.add("a");
		Lista1.add("CS");
		Lista1.add("Students");
		Lista1.add("Portal");

		Lista2.add("Geeks");
		Lista2.add("for");
		Lista2.add("Geeks");
		Lista2.add("is");
		Lista2.add("a");
		Lista2.add("CS");
		Lista2.add("Students");
		Lista2.add("Portal");
		
		Lista3.add("Geeks");
		Lista3.add("for");
		Lista3.add("Geeks");
		Lista3.add("is");
		Lista3.add("a");
		Lista3.add("CS");
		Lista3.add("Students");
		Lista3.add("Portal");
		
		Lista4.add("Geeks");
		Lista4.add("for");
		Lista4.add("Geeks");
		Lista4.add("is");
		Lista4.add("a");
		Lista4.add("CS");
		Lista4.add("Students");
		Lista4.add("Portal");
		
		Iterator<String> iter = Lista1.iterator();
		Iterator<String> iter2 = Lista2.iterator();
		Iterator<String> iter3 = Lista3.iterator();
		Iterator<String> iter4 = Lista4.iterator();
		
		System.out.println("The list is: \n" + Lista1);
		System.out.println("The list is: \n" + Lista2);
		System.out.println("The list is: \n" + Lista3);
		System.out.println("The list is: \n" + Lista4);
		System.out.println("\nThe iterator values" + " of Arraylist are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next().toString() + " ");
			
		}
		System.out.println("\nThe iterator values" + " of HashSet are: ");
		while (iter2.hasNext()) {
			System.out.print(iter2.next().toString() + " ");
			
		}
		System.out.println("\nThe iterator values" + " of LinkedHashSet are: ");
		while (iter3.hasNext()) {
			System.out.print(iter3.next().toString() + " ");
			
		}
		System.out.println("\nThe iterator values" + " of TreeSet are: ");
		while (iter4.hasNext()) {
			System.out.print(iter4.next().toString() + " ");
			
		}
	}
}
