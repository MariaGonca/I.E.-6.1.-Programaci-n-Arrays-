package Array6;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array6 {
	
	static Scanner sc = new Scanner(System.in);
	/**
	 * Leer un array de 10 elementos y efectuar una búsqueda de un elemento,
mostrando la posición en la que se encuentra dicho elemento.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] vector6 = new int[10];
		int i;    //La variable i indica la posicion
		int num=0;
		System.out.println("Inserte los 10 elementos del vector: ");
		
		//Creamos el vector
		for(i=0; i<vector6.length; i++){
			vector6[i]=sc.nextInt();	
	    }
		
		//Se muestra el resultado por pantalla
		System.out.println("El vector es: ");
		for(i=0; i<vector6.length; i++){
		System.out.print(vector6[i] + " ");
		}
		
		//Pedimos buscar un valor del vector y lo almacenamos en la variable num
		System.out.println(" ");
				
		System.out.println("Busque la posición de algún valor del vector ");
		num=sc.nextInt();
		for(i=0; i<vector6.length; i++) {
			
			if (num==vector6[i]) {
				System.out.print("El valor "+vector6[i]+ " se encuentra en la posición " +(i+1)+ " del vector");
			}
		}		
	}
}	

