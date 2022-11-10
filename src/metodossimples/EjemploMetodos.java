package metodossimples;

import static java.lang.Math.*;

public class EjemploMetodos {
	//Metodo no estatico que no devuelve o retorna valor
	//, y no recibe parametros de entrada (argumentos) 

	public void imprimirAlgo() {
		if(random() > 0.5) {
			System.out.println("Numero muy grande! ");
			return;
		}else {
			System.out.println("Numero muy pequeno! ");
		}
		System.out.println("Desde el final del primer metodo! ");
	}
	
	
	public static void main(String[] args) {
		//Para los metodos no estaticos se debe crear un objeto
		//para poder llarmarlos o invocarlos
		EjemploMetodos ej = new EjemploMetodos();
		ej.imprimirAlgo();
		

	}

}
