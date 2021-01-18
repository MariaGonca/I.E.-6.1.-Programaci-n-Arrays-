package Array26;
import MisMétodos.MetodosArray;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array26 {
/**
 * Leer una cadena y encriptarla empleando el método Cesar, que consiste en
	desplazar cada carácter 3 posiciones.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		int posiciones;
		
		//Pide cadena a encriptar y número de posiciones a desplazar
		//Llama a el método César del paquete MisMétodos
			System.out.println("Escriba la cadena a encriptar mediante César");
			cadena = sc.next();
			System.out.println("Indica el número de posiciones que quieres hacer mover la cadena");
			posiciones = sc.nextInt();
			sc.close();
		
			System.out.println("Cifrado");
			MetodosArray.Cesar(cadena, posiciones);
		
	}
}
