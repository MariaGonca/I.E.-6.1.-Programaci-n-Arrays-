package Array32;
import java.util.Scanner;
import MisM�todos.MetodosArray;
/**
 * 
 * @author mcgca
 *
 */
public class Array32 {
/**
 * Realiza un m�todo esCapicua que tome como par�metro un entero y devuelva
true si el n�mero es capic�a y false en caso contrario.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		System.out.println("Introduce un n�mero para saber si es capic�a");
		
		//Fallo si no se introduce un n�mero
		try {
			numero = sc.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("No era un numero");
		}

		//Llama al m�todo esCapic�a de MetodosArray
		if(!MetodosArray.esCapicua(numero)){
			System.out.println("No es capic�a");
		}else {
			System.out.println("S� es capic�a");
		}
		
		sc.close();
	}
}
