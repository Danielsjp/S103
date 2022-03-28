package n1exercici2.copy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
class Month {
	
     public static HashSet<String> name = new HashSet<String>();
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
		//Elemento duplicado
		name.add(mes2);
		
		name.add(mes3);
		name.add(mes4);
		name.add(mes5);
		//Elemento duplicado
		name.add(mes5);
		name.add(mes6);
		name.add(mes7);
		name.add(mes8);
		name.add(mes9);
		name.add(mes10);
		name.add(mes11);
		//muestra los valores sin duplicarlos.
		System.out.println(name);
	}
	
	

	 
}

public class Principal {

	public static void main(String[] args) {
	// Introduce meses 
    final Month hola = new Month("Febrero", "Enero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre", "Octubre", "Noviembre", "Diciembre");
	
 
	}

}
