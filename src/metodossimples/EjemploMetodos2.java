package metodossimples;

import static java.lang.Math.*;

public class EjemploMetodos2 {
	//Metodo no estatico que no devuelve o retorna valor
			//, y no recibe parametros de entrada (argumentos) 
	
	public String imprimirOtraCosa() {
		if (random() > 0.5) {
			return "Dentro del if";
		}
		return "Desde el final del segundo metodo";
	}

	public static void main(String[] args) {
		//Para los metodos no estaticos se debe crear un objeto
		//para poder llarmarlos o invocarlos
		EjemploMetodos2 ej = new EjemploMetodos2();
		ej.imprimirOtraCosa();
		//Para recibir algo de un metodo que devuelve algo que se va a guardar
		//en una variable el valor retornado
		String cadena = ej.imprimirOtraCosa();
		System.out.println("El metodo que devuelve una cadena, retorno: " + cadena);
		//Tambien podemos invocar un metodo que devuelve algo
		//desde otro metodo, por ejemplo, println()
		System.out.println(ej.imprimirOtraCosa());
		


	}

}
