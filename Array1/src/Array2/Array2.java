package Array2;
/**
 * 
 * @author mcgca
 *
 */
public class Array2 {
/**
 * Obtenga la sumatoria y la media de los elementos de un array.
 * @param args
 */
	public static void main(String[] args) {
		
		//Declaramos el vector, variables suma y media
		//También declaramos i para determinar la posición
		int[] vec = {1,2,3,4,5};
		int sumatoria = 0;
		int media = 0;
		int i; 
		
		//Bucle for para sumar cada posición
		//con vec.length se calcula la media
		for (i=0; i<vec.length; i++) {
		sumatoria+=vec[i];
		media = sumatoria/vec.length;
		}
		System.out.println(sumatoria + "La suma es: ");
		System.out.println(media + "La media es: ");		
	}
}
