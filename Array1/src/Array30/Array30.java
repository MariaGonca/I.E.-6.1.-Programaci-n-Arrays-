package Array30;
import java.util.*;
/**
 * 
 * @author mcgca
 *
 */
public class Array30 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Crea objeto de la clase StringTokenizer
		//Establecemos ºn como límite para crear un token en lugar del espacio
		//Así Juan Carlos forma un token, no dos
		StringTokenizer st = new StringTokenizer("Juan Carlos\n8.5\nAndrés\n4.9\nPedro\n3.8\nJuan\n6.3","\n");
		//mientras hasMoreTokens sea true repite el print
		//mostrando los token de dos en dos
		while (st.hasMoreTokens()) {                                                                                       
		       System.out.println("El alumno "+st.nextToken()+" ha sacado la nota "+st.nextToken());
		}
	}

}
