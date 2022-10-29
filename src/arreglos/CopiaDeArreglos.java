package arreglos;

public class CopiaDeArreglos {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr2 = new int[10];
		System.out.println("======Elemento de arr ======");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("=====Elemento de arr2[]=====");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i] + "\t");
		}
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println("=======Elementos nuevos del arr2[]=====");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + "\t");
		}
		System.out.println();
		arr = arr2;
		System.out.println("=======Elementos del arr[] despues de asignar la direccion de arr2[]========");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}

	}

}
