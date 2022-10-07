package clasescanner;

import java.util.Scanner;

public class InfoPersonal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre, apellido;
		int edad;
		double peso;
		System.out.println("Ingrese su nombre: ");
		nombre = lector.next();
		System.out.println("Ingrese su apellido: ");
		apellido = lector.next();
		System.out.println("Ingrese su edad: ");
		edad = lector.nextInt();
		System.out.println("Ingrese su peso: ");
		peso = lector.nextDouble();
		
		System.out.println("Su nombre es: " + nombre+ " " + apellido);
		System.out.println("Su edad es: " + edad);
		System.out.println("Su peso es: " + peso + " Libras ");
		lector.close();
	

	}

}
