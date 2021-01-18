package Array9;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array9 {

	static Scanner sc = new Scanner(System.in);
/**
 * Elabore un programa que permita introducir 20 elementos de tipo entero en un
arreglo, el programa mostrara impreso el arreglo en orden inverso.	
 * @param args
 */
	public static void main(String[] args) {
		
		//Se crea el vector de 20 números
		int[] vector9 = new int[20];
		int i=0;
				
		System.out.println("Inserte un arreglo de 20 números: ");
		
		for(i=0; i<vector9.length; i++){
			vector9[i]=sc.nextInt();
		}
		
		//Mostrar el arreglo en orden inverso
		System.out.println("Imprimiendo orden inverso.");
        for (i = vector9.length - 1; i >= 0 ; i--) {
            System.out.print(vector9[i] + "  ");
        }			
	}
}
