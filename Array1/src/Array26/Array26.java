package Array26;
import MisM�todos.MetodosArray;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array26 {
/**
 * Leer una cadena y encriptarla empleando el m�todo Cesar, que consiste en
	desplazar cada car�cter 3 posiciones.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		int posiciones;
		
		//Pide cadena a encriptar y n�mero de posiciones a desplazar
		//Llama a el m�todo C�sar del paquete MisM�todos
			System.out.println("Escriba la cadena a encriptar mediante C�sar");
			cadena = sc.next();
			System.out.println("Indica el n�mero de posiciones que quieres hacer mover la cadena");
			posiciones = sc.nextInt();
			sc.close();
		
			System.out.println("Cifrado");
			MetodosArray.Cesar(cadena, posiciones);
		
	}
}
