package Array25;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array25 {
/**
 * Realiza un programa que realice una sustitución de una palabra por otra dentro
	de una cadena que tenga las palabras separadas por un carácter blanco.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String frase = "Puedes cambiar cualquier palabra de esta frase";
		System.out.println("Puedes cambiar cualquier palabra de esta frase");
		String palabra;
		String palabra2;
		System.out.println("Escriba la palaba que quiere sustituir");
		palabra = sc.nextLine();
		System.out.println("Escriba la palaba que quiere escribir en su lugar");
		palabra2 = sc.nextLine();
		
		//Llama a replaceAll
		String nuevaFrase = frase.replaceAll(palabra, palabra2);
		System.out.println(nuevaFrase);
		sc.close();
	}
}
