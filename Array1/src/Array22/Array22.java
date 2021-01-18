package Array22;
import MisMétodos.MetodosArray;
/**
 * 
 * @author mcgca
 *
 */
public class Array22 {
/**
 * Dada una matriz cuadrada invertir su diagonal principal.
 * @param args
 */
	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,8},{3,4,5,4},{9,6,0,9},{4,6,7,3}};
		
		//Invoca al método que invierte la diagonal principal de una matriz dada
		MetodosArray.invertirDiagonal(A);
	}
}
