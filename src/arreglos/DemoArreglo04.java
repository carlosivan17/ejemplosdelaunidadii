package arreglos;

public class DemoArreglo04 {

	public static void main(String[] args) {
		// Arreglos iniciales de caracteres
		char[] arregloA = {'D', 'A','N','I','L','O','N','O','G','U','E','R','A'};
		char[] arregloB = new char[10];
		//copia de los elementos
		System.arraycopy(arregloA, 0, arregloB, 1, 6);
		System.out.println(new String (arregloB));
		//Eliminar elementos del arreglo
		int indicador = 3; //indice del elemento a eliminar
		for(int i = 0; i < arregloA.length;i++) {
			if(indicador == i) {
				for(int j = i + 1; i < arregloA.length - 1; j++) {
					arregloA[i] = arregloA[j];
					i++;
				}
				System.out.println(arregloA);
			}
		}

	}

}
