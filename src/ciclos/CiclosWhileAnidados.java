package ciclos;

public class CiclosWhileAnidados {

	public static void main(String[] args) {
		System.out.println("Este es el ciclo while anidado");
		int contadorFilas = 0;
		int contadorColumna = 0;
		while(contadorFilas < 2) {
			while(contadorColumna < 3) {
				//Nota el uso y efecto de print()
				System.out.println(contadorColumna + "");
				contadorColumna++;
			}
			System.out.println();
			contadorColumna = 0;    //Reinicia el conteo de columnas
			contadorFilas++;
		}

	}

}
