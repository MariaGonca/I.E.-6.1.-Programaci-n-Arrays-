package Array20;
import MisMétodos.MetodosArray;

import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class paresImpares {		 
/**
 * 
 * Crear un programa llamado paresImpares que cree un array de 100 números
aleatorios del 1 al 1000. Una vez creado, mostrar el contenido y después
organizarlo de forma que estén juntos los elementos pares y los impares en dos
vectores distintos.
 * 				 
 * @param args
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array20;
		System.out.println("Introduce la longitud del array");
		int longitud = sc.nextInt();
		System.out.println("Introduce el valor máximo y mínimo");
		int maximo = sc.nextInt();
		int minimo = sc.nextInt();
		array20 = MetodosArray.arrayAleatorio(longitud, minimo, maximo);
		
		//Imprime el array por pantalla
		System.out.println("El array es: ");
		for (int i = 0; i<array20.length;i++) {
			System.out.println(array20[i]+ " ");
		}
		
		//Creamos nuevos vectores donde almacenaremos los pares y los impares
		int[] par = new int [array20.length];
		int[] impar = new int [array20.length];
		int p = 0;
		int imp = 0;
		
		for (int i=0; i<array20.length;i++) {
			if (array20[i]%2==0) {
				par[p] = array20[i];
				p++;
			}
			
			if (array20[i]%2!=0) {
				impar[imp] = array20[i];
				imp++;
			}		
		}
		
		System.out.println("El vector par es: ");
		for (int i=0; i<par.length;i++) {
			System.out.print(par[i]+"  ");
		}
		
		System.out.println(" ");
		
		System.out.println("El vector impar es: ");
		for (int i=0; i<par.length;i++)	{
			System.out.print(impar[i]+"  ");		
		}	
		sc.close();	
	}		
}
