package Array24;
import MisM�todos.MetodosArray;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array24 {
/**
 * Realiza un programa que a partir de dos arrays determine si uno est� contenido
	en el otro.
 * @param args
 */
	
	public static void main(String[] args) {
		
		//Pide introducir la pablabra y  usa el m�todo contarVocales del paquete MisM�todos
		Scanner sc = new Scanner(System.in);
		String P;
		System.out.println("Escriba la palaba para contar las vocales");
		P = sc.nextLine();
		sc.close();	
		
		System.out.println("La palabra tiene "+MetodosArray.contarVocales(P)+" vocales");	
	
	}
}
