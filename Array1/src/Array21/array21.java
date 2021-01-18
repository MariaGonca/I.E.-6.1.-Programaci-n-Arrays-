package Array21;
import MisMétodos.MetodosArray;
/**
 * 
 * @author mcgca
 *
 */
public class array21 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3},{3,4,5},{9,6,0}};
		int B[][] = {{99,5,6},{5,8,1},{5,8,3}};
		
		//Invoca al método intercambiarMaxMinArray de la clase MetodosArray del paquete MisMétodos
		//Pasa como parámetros A y B
		MetodosArray.intercambiarMaxMinArray(A, B);
	}
}
