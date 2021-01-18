package Array4;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array4 {
	//Leer un array de 10 elementos enteros y mostrar el valor del elemento mayor,
	//menor y la media aritm�tica.

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Creamos las variables
		int[] vector4 = new int[10];
		int i;
		int mayor, menor;	
	    int posicionMayor = 0;
	    int posicionMenor = 0;
	    int suma = 0;
	    int media = 0;
	    
		System.out.println("Inserte los elementos del vector");
			
		//Pedimos al usuario que de valores al vector
			for(i=0; i<vector4.length; i++){
				System.out.print("N�mero para la posici�n " +i+ " = ");
	            vector4[i]=sc.nextInt();
	    }
		//Empezamos suponiendo que el n�mero mayor y menor est�n en la posici�n 0 y es el mismo
			mayor = menor = vector4[0];
		
		//Vamos comparando las posiciones y si sin mayor que la variable mayor �sta cambia su valor 
		for(i=0; i<vector4.length; i++)	{
		if (vector4[i] > mayor) {
			mayor = vector4[i];
			posicionMayor = i;
		}
		}
		
		//Hacemos los mismo con menor
		for(i=0; i<vector4.length; i++)	{
			if (vector4[i] < menor) {
				menor = vector4[i];
				posicionMenor = i;
		}
		}
		
		//Hacemos la media
		for(i=0; i<vector4.length; i++) {
			suma+=vector4[i];
			media=(suma/vector4.length);
		}
				
		//Mostramos todo el vector y los valores de menor y mayor
		for (i=0; i<vector4.length; i++) {
	    	   System.out.print(vector4[i]+ "\t");
	       }
		System.out.println(" ");
		System.out.println("El n�mero mayor es: "+mayor+" en la posici�n "+posicionMayor+ " y el menor es: "+ menor+ " en la posicion " +posicionMenor);
		System.out.println("La media es: "+media);
	}
}