package Array14;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array14 {
/**
 * 
 * @param args
 * Dado una secuencia de número leídos y almacenados en un vector A y un
número leído determinar si dicho número se encuentra o no en el vector.
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] A = new  int[10];
		 
		//Creamos el vector 
		System.out.println("Inserte los valores del vector ");
		for(int i=0; i<A.length; i++){
			A[i]=sc.nextInt();
		}
		
		//Pedimos el número a buscar
		int a;
		System.out.println("Inserte el valor a buscar ");
		a = sc.nextInt();
		
		//Creamos la variable c para saber si el número introducido está en el vector
		//Su valor inicial es 0
		int c = 0;	
		
		//Si el número está el valor de c cambia a 0
		for (int i = 0; i <A.length; ++i) {	
			if(a == A[i]) {
				c=1; }
		}
		
		//Dependiendo del valor de c se muestra un mensaje distinto
		if (c == 1) {
			System.out.println("El número se encuentra en el vector");	
		}else 
			System.out.println("El número no se encuentra en el vector");	
		
		sc.close();
	}	
}
