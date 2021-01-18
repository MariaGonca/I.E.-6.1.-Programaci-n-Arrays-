package Array29;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array29 {
/**
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nifIntroducido;
	
		//Introduce el NIF
		System.out.println("Introduce un NIF para verificar si es v�lido");
		nifIntroducido = sc.nextLine();
		
		//Si no tiene 9 car�cteres lo vuelve a pedir
		while (nifIntroducido.length()!=9) {
			System.out.println("NIF largo/corto");
			System.out.println("Introduce un NIF para verificar si es v�lido");
			nifIntroducido = sc.nextLine();
		}
		
		
		boolean correcto = true;
		//En caso de que los 8 primeros caracteres no sean n�meros boolean correcto pasa a ser false
		for(int i=0; i<(nifIntroducido.length()-1) && correcto == true; i++) {

			int numeros = nifIntroducido.charAt(i);					
			if ( numeros < 48 || numeros > 57){
				correcto=false;
			}
		}
		

		//El String letra toma el valor del �ltimo caracter (en la posicion 8) de nifIntroducido
		//letraF toma el char de letra
		String letra = nifIntroducido.substring(8);
		int letraF = letra.charAt(0);
		
		//Si correcto es false da error
		if(correcto == false) {
			System.out.println("Los 8 primeros no son todos numeros. NIF no v�lido");
		//Si correcto es true y adem�s el �ltimo d�gito de nifIntroducido es una letra
		//muestra los n�meros por pantalla
		}else if((letraF>64 && letraF<91) || (letraF>96 && letraF<123)) {
			System.out.println(nifIntroducido.substring(0, 8));
		//Si no se cumplen todas las reglas da error
		}else {System.out.println("NIF no v�lido");}


		sc.close();
	
	}
}
