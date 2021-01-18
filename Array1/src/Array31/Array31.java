package Array31;
import java.util.StringTokenizer;
/**
 * 
 * @author mcgca
 *
 */
public class Array31 {
/**
 * Modifica el código del ejercicio anterior para que las notas se almacenen en un
vector de datos double.
 * @param args
 */
	public static void main(String[] args) {
	
		//Igual que en el anterior, crea objeto tokenizer, esta vez sólo con nombres
		StringTokenizer st = new StringTokenizer("Juan Carlos\n8.5\nAndrés\n4.9\nPedro\n3.8\nJuan\n6.3","\n");
		//Creamos vectorNotas de longitud 4 para luego almacenar las 4 notas
		double[] vectorNotas = new double [4];
		int numero_notas = 0;
		//Mientras haya más token, cada segundo token se almacena en el vector
		while (st.hasMoreTokens()) { 					
				System.out.print("El alumno "+st.nextToken());
				vectorNotas[numero_notas] = Double.parseDouble(st.nextToken());		
				System.out.print(" ha sacado la nota "+vectorNotas[numero_notas]);
				numero_notas++;	  
				System.out.println(" ");
		}	
	}
}
