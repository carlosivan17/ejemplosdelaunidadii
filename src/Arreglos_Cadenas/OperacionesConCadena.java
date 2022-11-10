package Arreglos_Cadenas;

public class OperacionesConCadena {

	public static void main(String[] args) {
		String str = "Introduccion a la programacion";
		System.out.println("str = " + str);
		System.out.println("Tamano de la str = " + str.length());
		System.out.println("Contenido de str a partir del caracter 18 = " + str.substring(18));
		System.out.println("str esta vacia? - >" + str.isEmpty());
		System.out.println("str en minusculas = " + str.toLowerCase());
		System.out.println("str en mayusculas = " + str.toUpperCase());
		String cad = "Introduccion a la programacion";
		//str1 - cad -> segun UNICODE -> o = 111 y o = 243
		System.out.println("str = " + str);
		System.out.println("cad = " + cad);
		System.out.println("Diferencia lexicografica entre str y cad = " + str.compareTo(cad));
		int a = 50;
		System.out.println("a = " + a);
		String entero = String.valueOf(a);
		System.out.println("a convertido a cadena = " + entero);
		String reemplazo = cad.replace('o', 'o');
		System.out.println("cad con la letra o reemplazada por o = " + reemplazo);
		System.out.println("Nueva cad contiene la letra e? ->" + reemplazo.contains("e"));
		System.out.println("str es igual a Nueva cad? -> " + str.equals(reemplazo));
		System.out.println("Que hay en str en la posicion 18? -> " + str.charAt(18));
		System.out.println("str termina con la letra n? -> " + str.endsWith("n"));
	}

}
