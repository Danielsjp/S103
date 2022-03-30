package n1exercici8;
import java.util.ArrayList;
import java.util.*;
public class Principal  {

	public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(101, "Zues", 26));
	   arraylist.add(new Student(505, "Abey", 24));
	   arraylist.add(new Student(809, "Vignesh", 32));

	   System.out.println("Student Name Sorting:");
	   // Llamada a la clase collections con el metodo sort. El objeto almacena de studen su nombre.
	   Collections.sort(arraylist, Student.StuNameComparator);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
	   // Llamada a la clase collections con el metodo sort. El objeto almacena de studen su id.
	   /* Sorting on Rollno property*/
		/*
		 * System.out.println("RollNum Sorting:"); Collections.sort(arraylist,
		 * Student.StuRollno); for(Student str: arraylist){ System.out.println(str); }
		 */
	}
}