package Array11;
import java.util.Random; //Importamos Random para obtener números aleatorios
import java.util.Arrays; //Importamos Arrays para usar sort y ordenar los elementos del array
/**
 * 
 * @author mcgca
 *
 */
public class Array11 {
	/**
	 * 
	 * @param args
	 * 11. Realiza un programa que cree 1000 números aleatorios y muestre los 10
		mayores.
	 */
	public static void main(String[] args) {
		
		Random rd = new  Random(); //Se crea un objeto random
		int[] array = new  int[1000];  //Se crea arreglo de 1000 posiciones
		
		for(int i=0; i<array.length; i++) {
			array[i] = rd.nextInt();  //Asignamos un número random a cada posición con el método nextInt() del objero Random rn	
		}
		
		Arrays.sort(array);
		
		for(int i=990; i<array.length; i++) {  //Para los 10 últimos (mayores) usamos for y print para mostrarlos por pantalla  
			System.out.print(array[i]+ " ");
		}		
	}
}
