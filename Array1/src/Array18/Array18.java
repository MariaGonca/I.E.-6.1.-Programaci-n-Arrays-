package Array18;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array18 {
/**
 * 
 * @param args
 * Leer una secuencia de 20 números almacenarlos en un vector A[1..20] y mostrar
	la suma de los elementos que ocupan posiciones pares y el mayor de los que
	ocupan posiciones impares.
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] vector18 = new int[20];		
		int sumapar = 0;
		int mayorimpar = 0;
		
		System.out.print("Introduce los 20 valores del vector");
		
		//Creamos el vector pidiéndolo por teclado
		for (int i=0; i<vector18.length;i++) {
			vector18[i]=sc.nextInt();
		}
		
		//Almacemanos en las variables el resultado de las operaciones
		for (int i=0; i<vector18.length;i++) {
			if (mayorimpar<vector18[i]) {
				mayorimpar = vector18[i];			
			}	
			if(vector18[i]%2==0) {
				sumapar = sumapar+vector18[i];			
			}
		}
		System.out.print("La suma de los números pares es "+sumapar+" y el mayor de los impares es "+mayorimpar);
		sc.close();
	}
}

