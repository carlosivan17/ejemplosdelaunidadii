package cicloforeach;

import java.util.ArrayList;

public class DemoForEach2 {

	public static void main(String[] args) {
		//Declaracion de una coleccion generica de String 
		//Es un ArrayList de cadenas
		ArrayList<String> baldeString = new ArrayList<>();
		String nombre = "Carlos";
		baldeString.add("Hola");
		baldeString.add("Hello");
		baldeString.add("Hi");
		baldeString.add(nombre);
		
		for(String cadena : baldeString) {
			System.out.println("La cadena es " + cadena);
		}
		

	}

}
