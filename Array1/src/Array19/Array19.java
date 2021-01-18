package Array19;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array19 {
/**
 * Dado un vector de números determina aquellos que sea primos.
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] vector19 = new int[7];
		System.out.println("Inserte valores del vector");
		
		for(int i=0;i<vector19.length;i++) {
			vector19[i]=sc.nextInt();	
		}
		
		//Imprime por pantalla aquellos números del vector cullo resto al dividirlo entre dos no es 0
		 System.out.print("Los números impares son: ");
		for(int i=0;i<vector19.length;i++) {
		if(vector19[i]%2!=0) {
			System.out.print(vector19[i]+" "); 
		}}
		sc.close();
	}
	
	
	
}
