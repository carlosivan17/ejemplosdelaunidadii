package POOMetodos;

public class CalculadoraDeSuma {
	public int sumar(int sumandoX, int sumandoY) {
		int resultado = sumandoX + sumandoY;
		return resultado;
	}

	public static void main(String[] args) {
		CalculadoraDeSuma cal = new CalculadoraDeSuma();
		int suma = cal.sumar(10, 30);
		System.out.println("El resultado de la suma es: " + suma);

	}

}
