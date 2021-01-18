package Array1;
import java.util.Scanner;  //importamos Scanner
/**
 * 
 * @author mcgca
 *
 */
public class Ejercicio1Arrays {
/**
 * Dado un vector de 5 enteros actualizar cada posición de dicho vector con un
	número leído.
 */
	static Scanner nuevoNumero = new Scanner(System.in);
	
	public static void main (String[] args) {
		//Declaramos las variables
		int nuevoValor, posicion;		
		int[] vector = {1,2,3,4,5};
		int i;	
	
	//Pedimos por pantalla el nuevo número y su pocisión	
	System.out.println("Escribe el nuevo valor y la posición (entre 1 y 5): ");
		
	nuevoValor = nuevoNumero.nextInt();
	posicion = nuevoNumero.nextInt();	
	
	//Si la posición no está dentro del rango muestra pocisión incorrecta
	if (posicion < 1 || posicion > 5) {
		System.out.println("Posición incorrecta");
	}else {
		//Si la posición es válida asigana a esa posición el nuevo valor
		//e imprime el vector por pantalla
		vector[posicion-1] = nuevoValor;
		System.out.println("El vector es: ");
		for (i=0; i < vector.length; i++) 
			System.out.print(vector[i] + "\t");
			}	
	}	
	}		

