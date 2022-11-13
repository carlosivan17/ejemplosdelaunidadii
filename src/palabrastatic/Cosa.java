package palabrastatic;

public class Cosa {
	//Miembros de la clase
	private int x;     //no static
	private static int y;
    //main es un metodo static
	public static void main(String[] args) {
		y = 99;      //Valor de y asociado a la clase Cosa
		System.out.println("y = " + y);
        //creacion de instancias de cosa
		Cosa c1 = new Cosa();
		Cosa c2 = new Cosa();
		System.out.println("====Instancias de Cosa====");
		System.out.println("c1.y = " + c1.y);
		System.out.println("c2.y = " + c2.y);
		//Asignaciones de valores de x
		c1.x = 100;
		c2.x = 200;
		System.out.println("========Instancia de Cosa========");
		System.out.println("c1.x = " + c1.x);
		System.out.println("c2.x = " + c2.x);
		System.out.println("========Metodo static mostrarY()========");
		mostrarY();      //invocacion o llamada al metodo
		System.out.println("========Metodo no static mostrarX()=========");
		c1.mostrarX();//Invocacion o llamada al metodo
		c2.mostrarX();//Invocacion o llamada al metodo
	}
	//Metodo no static
	void mostrarX() {
		System.out.println("x = " + x);
		System.out.println("This.x = " + this.x);
		//System.out.println("Cosa.x = " + Cosa.x);
		System.out.println("y = " + y);
		System.out.println("Cosa.y = " + Cosa.y);
		System.out.println("This.y = " + this.y);
	}
	static void mostrarY() {
		System.out.println("y = " + y);
		System.out.println("Cosa.y = " + Cosa.y);
		//System.out.println("This.y = " + this.y);
		//System.out.println("x = " + x);
		//System.out.println("This.y = " + this.y);
	}

}
