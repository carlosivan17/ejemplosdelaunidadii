package arreglos;

public class DemoArreglo02 {

	public static void main(String[] args) {
		//Arreglo de 2 x 2
		int [][] matrizA = {
				{1,2},
				{3,4}
		};
		//Arreglo de 3 x 2
		int [][] matrizB = {
				{5,6},
				{7,8},
				{9,10}
		};
		System.out.println("Tamano de la matrizA = " + matrizA.length);
		System.out.println("Tamano de la matrizB = " + matrizB.length);
		System.out.println("Tamano del primer arreglo dentro de matrizA = " + matrizA[0].length);
		System.out.println("Tamano del primer arreglo dentro de la matrizB = " + matrizB[0].length);

	}

}
