package arreglos.unidimensionales;

import java.util.Scanner;

public class InicializacionIteracion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrI = new int[10];
		System.out.println("Ingrese los elementos del arreglo: ");
		for (int i = 0; i < arrI.length;i++) {
			arrI[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Los elementos del arreglo son:");
		for(int i = 0; i < arrI.length;i++) {
			System.out.println("Elemento [" + i + "] = " + arrI[i]);
		}
		
	}

}
