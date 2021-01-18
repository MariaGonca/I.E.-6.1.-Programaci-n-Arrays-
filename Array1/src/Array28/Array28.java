package Array28;
import MisM�todos.MetodosArray;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array28 {

	public static void main(String[] args) {
		/**
		 * Este programa indica si la palabra o frase introducida es un pal�ndromo
		 * Inserta solamente caracteres alfab�ticos
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa indica si la palabra o frase introducida es un pal�ndromo");
		System.out.println("Inserta solamente caracteres alfab�ticos");
		String cadenaInicial;
		
		//Los siguentes pasos son iguales que en el ejercicio 27
		do {
		System.out.println("Introduzca cadena s�lo de caracteres alfab�ticos: ");
		cadenaInicial = sc.nextLine();	
		}while(cadenaInicial.isEmpty());
		
		
		while(!MetodosArray.esSoloLetras(cadenaInicial)) {
			
			System.out.println("�S�lo letras!");
			System.out.println("Escribe de nuevo");
			cadenaInicial = sc.nextLine();	
		}
		
		//Llama al m�todo invertirString usando como par�metro cadenaInicial
		String cadenaInvertida = MetodosArray.invertirString(cadenaInicial);
		System.out.println(cadenaInvertida);
		
		
		//llama al m�todo palindromo para comprobar si cadenaInvertida y cadenaInicial son iguales
		boolean valor;
		valor = MetodosArray.palindromo(cadenaInicial, cadenaInvertida);
		
		if(valor==true) {
			System.out.println("S�, es pal�ndromo");
		}else
		{ System.out.println("No es pal�ndromo");}

		sc.close();
		
	}
}
