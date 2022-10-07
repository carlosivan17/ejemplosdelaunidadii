package ciclos;

import java.util.Scanner;

public class DemoCicloForCentinela {

	public static void main(String[] args) {
		System.out.println("Tercer ciclo for, ciclo centinela");
		Scanner sc = new Scanner(System.in);
		String SioNO = "Si";
		int num1 = 0;
		int sum = 0;
		int contador = 100;
		System.out.println("num1 = " + num1);
		//Cuando no hay sentencias, es un ciclo infinito o centinela
		for(;;) {
			num1 = num1 + 50;
			System.out.println("num1 = " + num1);
			sum = sum + num1;
			contador = contador - 10;
			System.out.println("Ingrese Si para continuar o No para salir");
			SioNO = sc.next();
			if(SioNO.equalsIgnoreCase("No")) {
				break;
			}
		}
		System.out.println("Fin del tercer ciclo for, ciclo centinela");
		System.out.println("sum = " + sum);

	}

}
