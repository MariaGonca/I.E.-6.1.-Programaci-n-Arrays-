package Array5;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */

public class Array5 {

	static Scanner sc = new Scanner(System.in);
	/**
	 * Realice un programa para leer un array ingresando solamente n�meros m�ltiplos
	de 3 que ingresan por teclado.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaramos el vector y la variable i
		int[] vector5 = new int[5];
		int i;
		
		//Pedimos por pantalla que inserte los valores 
		System.out.println("Inserte los elementos del vector (solo m�ltiplos de 3): ");
		
		//Con el bucle for y scanner hacemos todo el recorrido
		for(i=0; i<vector5.length; i++){
			vector5[i]=sc.nextInt();	
		
		//Con if dentro de for vuelve a pedir el n�mero introducido si no es m�ltiplo de 3
		//No sale hasta que todos sean multiplos
		if((vector5[i]%3)!=0) {
			System.out.println("El n�mero introducido en la posicion " +(i+1)+" no es m�ltiplo de tres");
			vector5[i]=sc.nextInt();		
		    }}

		//Muestra por pantalla el vector
		System.out.print("El vector es: ");
			for(i=0; i<vector5.length; i++){
			System.out.print(vector5[i]);
			}
		
	}}
	
