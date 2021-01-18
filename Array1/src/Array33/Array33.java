package Array33;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array33 {
/**
 * Diseñar un programa que permita mover una ficha sobre un tablero de 8x8. En
las celdillas de dicho tablero tenemos varias minas. El juego finaliza cuando el
usuario topa con una de dichas minas.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			//El número 2 será ua bomba
			int[][]	tablero = {{1,2,1,1,2,1,2,1},{1,1,2,1,1,2,2,1},{2,2,1,1,1,1,1,1},{2,1,1,1,2,1,1,2},{1,1,1,2,1,1,2,2},{1,1,1,1,1,1,1,1},{1,2,1,2,1,2,1,2},{2,2,2,2,2,2,2,2}};
			int fila = 0;
			int columna=0;
			int bomba = 0;
			
			//Cuando el valor del tablero sea 2 acaba el while 
				while(bomba != 2) {
					System.out.println("Inserte fila");
					fila=sc.nextInt();
					System.out.println("Inserte columna");
					columna=sc.nextInt();
					bomba = tablero[fila][columna];	
				}
				System.out.println("Has caído en una bomba");
		sc.close();		
	}
	
	
}
