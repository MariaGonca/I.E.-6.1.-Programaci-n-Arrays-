package Array23;
import MisM�todos.MetodosArray;
/**
 * 
 * @author mcgca
 *
 */
public class Array23 {
/**
 * Realiza un programa que a partir de dos arrays determine si uno est� contenido
en el otro.	
 * @param args
 */
	public static void main(String[] args) {
		
	int[] M = {1,2,3,4};
	int [][] A = {{7,7,7,7},{1,2,3,4},{7,7,7,7}};
	
	
	//El m�todo includes() determina si una matriz incluye un determinado elemento
	//devuelve true o false seg�n corresponda.
	
	MetodosArray.array12Contenido(M, A);
	System.out.println(" ");
	
	}
}
