package Array8;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array8 {

	static Scanner sc = new Scanner(System.in);
	/**
	 * Elabore un programa que permita introducir un arreglo de 25 elementos de tipo
	entero. Luego pedir al usuario que introduzca un n�mero. el programa mostrara
	el n�mero de veces que se repite dicho valor en el arreglo.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaramos num para el n�mero del que queremos ver las repeticiones
		//i para posic�n
		//Reteticiones para acumular la suma
		int[] vector8 = new int[25];
		int num = 0;
		int repeticiones = 0;
		int i;
		
		//Pedimos por pantalla los 25 n�meros
		System.out.println("Inserte un arreglo de 25 n�meros: ");
		
		for(i=0; i<vector8.length; i++){
			vector8[i]=sc.nextInt();
		}
		
		//Pedimos el n�mero a contar
		System.out.println("Inserte un n�mero para saber cu�ntas veces se repite en el arreglo ");
		num=sc.nextInt();
		
		//Para todas las posiciones del array, si num=numero contenido en el arreglo en i
		//Al valor de repeticiones de le suma 1
			for(i=0; i<vector8.length; i++){
		if (num==vector8[i]) {
			repeticiones+=1;		
		}
		}
		
		//Muestra por pantalla el resultado
		System.out.println("El n�mero se repite "+repeticiones+" veces.");		
	}
}
