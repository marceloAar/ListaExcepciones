//Marcelo Aceituno R
//Full Stack JAVA 0034
// Try - Catch
import java.util.ArrayList;

public class ListaExcepciones {

	public static void main(String[] args) {		
		
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		/*for(int i = 0; i < myList.size(); i++) {
		    int castedValue = (int) myList.get(i);		 	    
		}*/
		
		try {
			System.out.println(myList.get(5));
			 
		}catch(Exception e ) {
			System.out.println("ERROR: Estas intentando acceder a una posicion que no existe en la lista");	
			System.out.println(e.getMessage());
	
		}
		System.out.println("\nARREGLO: "+myList);
	}
}
