package n1exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		TreeMap<String, String> capitalCities2 = new TreeMap<String, String>();
		LinkedHashMap<String, String> capitalCities3 = new LinkedHashMap<String, String>();
		HashSet<String> capitalCities4 = new HashSet<String>();
		LinkedHashSet<String> capitalCities5 = new LinkedHashSet<String>();
		// Add keys and values (Country, City)
		capitalCities.put("a", "London");
		capitalCities.put("c", "Berlin");
		capitalCities.put("d", "Oslo");
		capitalCities.put("b", "Washington DC");
		capitalCities2.put("a", "London");
		capitalCities2.put("c", "Berlin");
		capitalCities2.put("d", "Oslo");
		capitalCities2.put("b", "Washington DC");
		capitalCities3.put("a", "London");
		capitalCities3.put("c", "Berlin");
		capitalCities3.put("d", "Oslo");
		capitalCities3.put("b", "Washington DC");
		System.out.println(capitalCities);
		System.out.println(capitalCities2);
		System.out.println(capitalCities3);
		for (String value : capitalCities.values()) {
			capitalCities4.add(value);
		}
		for (String value : capitalCities.values())
			capitalCities5.add(value);
		System.out.println(capitalCities4);
		System.out.println(capitalCities5);
	}

}
