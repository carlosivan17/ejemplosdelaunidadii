package arreglos.multidimensionales;

public class DemoArreglosMultidimensionales {
	//Metodo que muestra el arreglo de un contenido
	//como parametro de entrada necesita un arreglo multidimensional

	public static void mostrarArreglo2D(int[][] iaa) {
		System.out.println("El arreglo contiene: ");
		//Intera sobre el arreglo superior (mas grande)
		
		for(int i = 0; i < iaa.length; i++) {//va a tomar arreglos individuales de int
			//imprime el numero de elementos del arreglo de int que va a mostrar luego
			System.out.println(iaa[i].length + " elementos: ");
			//intera sobre el subarreglo para mostrar los int individuales
			for(int j = 0; j < iaa[i].length;j++) {
				System.out.println(" " + iaa[i][j]); //elementos int individuales
			}
			System.out.println(); //muestra un salto de linea
		}
	}
	public static void main(String[] args) {
		//inicializacion tipo iteracion
		int[][][] iaaa = new int[2][][]; //creacion de arreglo de nivel superior de 2 elementos
		iaaa[0] = new int [3][]; //el primer elemento de ese arreglo,  contiene 3 arreglos de int
		//inicializacion de esos 3 arreglos 2D de int
		iaaa[0][0] = new int[] {1, 2, 3}; //primer arreglo de int
		iaaa[0][1] = new int[] {1, 2}; //segundo arreglo de int
		iaaa[0][2] = new int[] {1}; //tercer arreglo de int
		//Llamada al metodo mostrarArreglo2D();
		//va a funcionar ya que los arreglos multidimensionales son arreglos de arreglos
		//como parametro de entrada tendra el primer elemento del arreglo de nivel superior
		//el cual es un arreglo 2D
		mostrarArreglo2D(iaaa[0]);
		
		

	}

}
