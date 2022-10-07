package operadores;

public class DemoSentenciasSwitch_03 {

	public static void main(String[] args) {
		String nombre = "Carlos";
		System.out.println("Sentencia antes de la primera sentencia switch");
		switch(nombre) { //Comparando nombre con constante con bloque switch
		case "Luis":
			System.out.println("El nombre tiene el valor de Luis");
			break;
		case "Juan":
			System.out.println("El nombre tiene el valor de Juan");
			break;
		case "Carlos":
			System.out.println("El nombre tiene el valor de Carlos");
			break;
		}
		System.out.println("Sentencia despues de la primera sentencia switch");

	}

}
