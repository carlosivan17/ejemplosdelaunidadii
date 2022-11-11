package POOMetodos;

public class LamadaPorValor {
	
	int dato = 50;
	int operar(int dato) {
		dato = dato*2/6;
		return dato;
	}

	public static void main(String[] args) {
		LamadaPorValor a = new LamadaPorValor();
		System.out.println("Antes de operar() el valor de dato = " + a.dato);
		a.operar(500);
		System.out.println("Despues de operar() el valor de dato = " + a.dato);

	}

}
