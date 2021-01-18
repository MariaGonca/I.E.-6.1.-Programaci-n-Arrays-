package Array13;
/**
 * 
 * @author mcgca
 *
 */
public class Array13 {
/**
 * 
 * @param args
 * Dado dos vectores A y B de 15 elementos cada uno, obtener un vector C donde
la posición i se almacene la suma de A[i]+B[i] y mostrar el mayor de los C[i].
 */
	public static void main(String[] args) {
		
		//Vectores a sumar
		int[] A = {1,2,3,4,5,77,7,2,0,22,3,4,55,3,25};
		int[] B = {3,66,7,3,22,4,6,99,6,5,33,4,5,12,3};
		
		//Vector resultante de la suma
		int[] array = new  int[15];
		
		//La suma de los valores de A y B en la posición i se almacena en la posición i del nuevo vector 
		for(int i=0; i<array.length; i++) {
			array[i] = A[i] + B[i];
		}
		
		for(int i=0; i<array.length; i++) {  //Para mostrarlo por pantalla  
			System.out.print(array[i]+ " ");
		}
	}
}
