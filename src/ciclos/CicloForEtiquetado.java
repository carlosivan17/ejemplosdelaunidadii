package ciclos;

public class CicloForEtiquetado {
	
	public static void main (String[] args) {
		aa: for(int i = 0; i<5;i++) {
			bb: for(int j = 0; j < 5;j++) {
				System.out.println(j);
				//System.out.println(" * ");
				//if(j == 1) {
					break aa;
					//continue;
					//continue aa;
				//}
			}
			//System.out.println();
			System.out.println(i);
		}
		
	}
}
