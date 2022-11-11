package metodossobrecargados;

public class DemoMetodosSobrecargados {
	public void hacerAlgo() {
		System.out.println("Metodo sobrecargado sin argumentos!");
	}
	public void hacerAlgo(String s) {
		System.out.println("Metodo sobrecargado con argumentos String = " + s);
	}
	public int hacerAlgo(int i) {
		System.out.println("Metodo sobrecargado con argumentos int = " + i);
		return i * 2;
	}

	public static void main(String[] args) {
		//como son metodos no estaticos se debe crear un objeto (instancia)
		DemoMetodosSobrecargados obj = new DemoMetodosSobrecargados();
		
		obj.hacerAlgo();
		obj.hacerAlgo("hola");
		int x = obj.hacerAlgo(10);
		

	}

}
