package Cadenas;

public class DemoStringPool02 {

	public static void main(String[] args) {
		String str1 = "Hola";
		System.out.println("Cadena original = " + str1);
		
		str1 = str1.concat(" como esta?");
		System.out.println("Despues de la concatenacion la cadena es " + str1);

	}

}
