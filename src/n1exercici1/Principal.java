package n1exercici1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Month {
	
     static ArrayList<String> name = new ArrayList<String>();
     String mes1;
     String mes2;
     String mes3;
     String mes4;
     String mes5;
     String mes6;
     String mes7;
     String mes8;
     String mes9;
     String mes10;
     String mes11;
    
	public Month(String mes1, String mes2, String mes3, String mes4, String mes5,String mes6,String mes7,String mes8,String mes9,String mes10,String mes11) {
		
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
		name.add(mes1);
		name.add(mes2);
		name.add(mes3);
		name.add(mes4);
		name.add(mes5);
		name.add(mes6);
		name.add(mes7);
		name.add(mes8);
		name.add(mes9);
		name.add(mes10);
		name.add(mes11);
		//Chequea si en el array existen cada uno de los mismos y los reordena una vez encontrados
		if(name.contains("Enero") && name.contains("Febrero") && name.contains("Marzo") && name.contains("Abril") && name.contains("Junio") && name.contains("Julio") && name.contains("Julio") && name.contains("Septiembre") && name.contains("Octubre") && name.contains("Noviembre") && name.contains("Diciembre)")){
			name.set(0, "Enero");
			name.set(1, "Febrero");
			name.set(2, "Marzo");
			name.set(3, "Abril");
			name.set(4, "Mayo");
			name.set(5, "Junio");
			name.set(6, "Julio");
			name.set(7, "Septiembre");
			name.set(8, "Octubre");
			name.set(9, "Noviembre");
			name.set(10, "Diciembre"); }
		//un for que chequea si existen los valores ( otra manera de hacerlo, nose si mas eficiente)
		//for(String x : name){
		// if(x.equals("Enero")){
		//name.set(0, "1Enero");
		//name.set(1, "Febrero");
		//name.set(2, "Marzo");
				//	name.set(3, "Abril");
		//name.set(4, "Mayo");
		//name.set(5, "Junio");
		//name.set(6, "Julio");
		//name.set(7, "Septiembre");
		//name.set(8, "Octubre");
		//name.set(9, "Noviembre");
		//name.set(10, "Diciembre");
		// break;
		//// }
		
		
	}
	
	


}

public class Principal {

	public static void main(String[] args) {
	// Introduce meses desordenados	
    final Month hola = new Month("Febrero", "Enero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre", "Octubre", "Noviembre", "Diciembre");
	// muestra los valores ordenados
    System.out.println(Month.name.get(0));
	System.out.println(Month.name.get(1));
	System.out.println(Month.name.get(2));
	System.out.println(Month.name.get(3));
	System.out.println(Month.name.get(4));
	System.out.println(Month.name.get(5));
	System.out.println(Month.name.get(6));
	System.out.println(Month.name.get(7));
	System.out.println(Month.name.get(8));
	System.out.println(Month.name.get(9));
	System.out.println(Month.name.get(10));
	
	}

}
