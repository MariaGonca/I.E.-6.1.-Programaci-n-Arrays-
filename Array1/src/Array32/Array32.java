package Array32;
import java.util.Scanner;
import MisMétodos.MetodosArray;
/**
 * 
 * @author mcgca
 *
 */
public class Array32 {
/**
 * Realiza un método esCapicua que tome como parámetro un entero y devuelva
true si el número es capicúa y false en caso contrario.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		System.out.println("Introduce un número para saber si es capicúa");
		
		//Fallo si no se introduce un número
		try {
			numero = sc.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("No era un numero");
		}

		//Llama al método esCapicúa de MetodosArray
		if(!MetodosArray.esCapicua(numero)){
			System.out.println("No es capicúa");
		}else {
			System.out.println("Sí es capicúa");
		}
		
		sc.close();
	}
}
