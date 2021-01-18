package Array28;
import MisMétodos.MetodosArray;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array28 {

	public static void main(String[] args) {
		/**
		 * Este programa indica si la palabra o frase introducida es un palíndromo
		 * Inserta solamente caracteres alfabéticos
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa indica si la palabra o frase introducida es un palíndromo");
		System.out.println("Inserta solamente caracteres alfabéticos");
		String cadenaInicial;
		
		//Los siguentes pasos son iguales que en el ejercicio 27
		do {
		System.out.println("Introduzca cadena sólo de caracteres alfabéticos: ");
		cadenaInicial = sc.nextLine();	
		}while(cadenaInicial.isEmpty());
		
		
		while(!MetodosArray.esSoloLetras(cadenaInicial)) {
			
			System.out.println("¡Sólo letras!");
			System.out.println("Escribe de nuevo");
			cadenaInicial = sc.nextLine();	
		}
		
		//Llama al método invertirString usando como parámetro cadenaInicial
		String cadenaInvertida = MetodosArray.invertirString(cadenaInicial);
		System.out.println(cadenaInvertida);
		
		
		//llama al método palindromo para comprobar si cadenaInvertida y cadenaInicial son iguales
		boolean valor;
		valor = MetodosArray.palindromo(cadenaInicial, cadenaInvertida);
		
		if(valor==true) {
			System.out.println("Sí, es palíndromo");
		}else
		{ System.out.println("No es palíndromo");}

		sc.close();
		
	}
}
