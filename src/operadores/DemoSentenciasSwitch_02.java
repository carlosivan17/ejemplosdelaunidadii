package operadores;

public class DemoSentenciasSwitch_02 {

	public static void main(String[] args) {
		char caracter = 'y';
		System.out.println("Sentencia antes de la primera sentencia switch");
		switch(caracter) { //comparando caracter con constante en el bloque switch
		case 'x':
			System.out.println("caracter tiene del valor de x");
			break;
		case 'y':
			System.out.println("caracter tiene el valor de y");
			break;
		case 'z':
			System.out.println("caracter tiene el valor de z");
			break;
		}
		System.out.println("Sentencia despues de la primera sentencia switch");

	}

}
