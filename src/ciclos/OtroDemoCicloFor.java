package ciclos;

public class OtroDemoCicloFor {

	public static void main(String[] args) {
		System.out.println("Segundo ciclo for, controlado con contador");
		int contador = 100;
		for(;contador >= 0;) {
			System.out.println("contador = " + contador);
			contador = contador - 30;
		}
		System.out.println("Fin del segundo ciclo for, controlado con contador");

	}

}
