package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Month {

	static ArrayList<String> names = new ArrayList<String>();
	private String mes1;
	private String mes2;
	private String mes3;
	private String mes4;
	private String mes5;
	private String mes6;
	private String mes7;
	private String mes8;
	private String mes9;
	private String mes10;
	private String mes11;

	protected Month(String mes1, String mes2, String mes3, String mes4, String mes5, String mes6, String mes7,
			String mes8, String mes9, String mes10, String mes11) {

		this.mes1 = mes1;
		this.mes2 = mes2;
		this.mes3 = mes3;
		this.mes4 = mes4;
		this.mes5 = mes5;
		this.mes6 = mes6;
		this.mes7 = mes7;
		this.mes8 = mes8;
		this.mes9 = mes9;
		this.mes10 = mes10;
		this.mes11 = mes11;
		names.add(mes1);
		names.add(mes2);
		names.add(mes3);
		names.add(mes4);
		names.add(mes5);
		names.add(mes6);
		names.add(mes7);
		names.add(mes8);
		names.add(mes9);
		names.add(mes10);
		names.add(mes11);
	}

	public ArrayList<String> getMes() {

		return names;

	}

}

public class Principal {

	public static void main(String[] args) {
		// Introduce meses desordenados
		final Month hola = new Month("Febrero", "Enero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre",
				"Octubre", "Noviembre", "Diciembre");
		// if (hola.getMes().get(1) !="Enero") {
		// System.out.println("Ordenar");
		// }
		// else {
		Month.names.set(0, "Enero");
		Month.names.set(1, "Febrero");
		Month.names.set(2, "Marzo");
		Month.names.set(3, "Abril");
		Month.names.set(4, "Mayo");
		Month.names.set(5, "Junio");
		Month.names.set(6, "Julio");
		Month.names.set(7, "Septiembre");
		Month.names.set(8, "Octubre");
		Month.names.set(9, "Noviembre");
		Month.names.set(10, "Diciembre");
		System.out.println(Month.names.get(0));
		System.out.println(Month.names.get(1));
		System.out.println(Month.names.get(2));
		System.out.println(Month.names.get(3));
		System.out.println(Month.names.get(4));
		System.out.println(Month.names.get(5));
		System.out.println(Month.names.get(6));
		System.out.println(Month.names.get(7));
		System.out.println(Month.names.get(8));
		System.out.println(Month.names.get(9));
		System.out.println(Month.names.get(10));
	}
}
