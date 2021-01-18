package Array1;
import java.util.Scanner;  //importamos Scanner
/**
 * 
 * @author mcgca
 *
 */
public class Ejercicio1Arrays {
/**
 * Dado un vector de 5 enteros actualizar cada posici�n de dicho vector con un
	n�mero le�do.
 */
	static Scanner nuevoNumero = new Scanner(System.in);
	
	public static void main (String[] args) {
		//Declaramos las variables
		int nuevoValor, posicion;		
		int[] vector = {1,2,3,4,5};
		int i;	
	
	//Pedimos por pantalla el nuevo n�mero y su pocisi�n	
	System.out.println("Escribe el nuevo valor y la posici�n (entre 1 y 5): ");
		
	nuevoValor = nuevoNumero.nextInt();
	posicion = nuevoNumero.nextInt();	
	
	//Si la posici�n no est� dentro del rango muestra pocisi�n incorrecta
	if (posicion < 1 || posicion > 5) {
		System.out.println("Posici�n incorrecta");
	}else {
		//Si la posici�n es v�lida asigana a esa posici�n el nuevo valor
		//e imprime el vector por pantalla
		vector[posicion-1] = nuevoValor;
		System.out.println("El vector es: ");
		for (i=0; i < vector.length; i++) 
			System.out.print(vector[i] + "\t");
			}	
	}	
	}		

