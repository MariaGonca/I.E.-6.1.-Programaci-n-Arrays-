package Array10;
/**
 * 
 * @author mcgca
 *
 */
public class Array10 {
/**
 * 
 * @param args
 * Elabore un programa que permita encontrar el primer y segundo mayor de un
	array de 15 elementos.
 */
	public static void main(String[] args) {
		
		int[] vector10 = {1,2,3,4,5,77,7,2,0,22,3,4,55,3,25};
		//Ponemos por defecto que los números mayor y menor valen 0
		int mayor = 0;
		int i;
		int segundoMayor = 0;
		
		/**
		 * Recorremos todo el vector, cuando encontremos un múmero mayor que "mayor"
		 * el valor de "segundoMayor" pasa a ser el de mayor, y el de mayor el del valor encontrado
		 */
		for (i=0; i<vector10.length; i++) {
					
			if 	(vector10[i]>mayor) {
				segundoMayor=mayor;
				mayor=vector10[i];		
			}
			
			if ((segundoMayor<vector10[i] && vector10[i]!=mayor) && segundoMayor < vector10[i]) {
				segundoMayor=vector10[i];
			}
			
		}	
		
		System.out.println("El mayor y el segundo mayor son: "+mayor+ " y "+segundoMayor);				
		}	
	}

