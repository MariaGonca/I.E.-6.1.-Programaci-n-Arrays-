package Array27;
import MisMétodos.MetodosArray;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array27 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		//Mientras no se introduzca ninguna cadena la sigue pidiendo
		do {	
			System.out.println("Introduzca cadena sólo de caracteres alfabéticos: ");
			cadena = sc.nextLine();		
		}while(cadena.isEmpty());
		
		//Contola que la cadena sólo sea de carácteres alfabéticos o espacios
		while(!MetodosArray.esSoloLetras(cadena)) {
			
			System.out.println("La cadena introducida no tiene exclusivamente caracteres alfabéticos");
			System.out.println("Introdúzquela de nuevo");
			cadena = sc.nextLine();	
		}
		
		//Lama al método invertirString del paquete MisMétodos
		System.out.println(MetodosArray.invertirString(cadena));				
		System.out.println(" ");
	
		int a=0;
		int o=0;
		int e=0;
		for (int i = 0; i < cadena.length(); i++) {
			
		
		//Cuenta las vocales a,o y e almacenando el número de repeticiones en diferentes variables 
		if(cadena.charAt(i)=='A' || cadena.charAt(i)=='a') {
			a++;
		}else if(cadena.charAt(i)=='O' || cadena.charAt(i)=='o'){
			o++;
		}else if(cadena.charAt(i)=='E'|| cadena.charAt(i)=='e') {
			e++;
		}
		}
		
		System.out.println("La letra A se repite "+a+" veces");
		System.out.println("La letra O se repite "+o+" veces");
		System.out.println("La letra E se repite "+e+" veces");
		
		//Dependiendo del número de repeticiones muestra el exceso
		if(a>10) {
			System.out.println("Exceso de a");
		}
		if(o>5) {
			System.out.println("Exceso de o");
		}
		if(e>3) {
			System.out.println("Exceso de e");
		}
		
		System.out.println("Realizar la búsqueda de una palabra dentro del primer String");
		System.out.println("Inserte palabra a buscar");
		
		//Pide la palabra a buscar dentro de la cadena y comprueba si se cumple
		CharSequence palabraBuscar = sc.nextLine();	
		if(cadena.contains(palabraBuscar)) {
			System.out.println("La palabra sí está contenida");
		}else {
			System.out.println("La palabra no está contenida");
		}		
		sc.close();
		
	}
}		
	
	
