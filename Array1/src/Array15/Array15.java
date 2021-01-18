package Array15;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array15 {
/**
 * 
 * @param args
 * Leer una secuencia de 20 números y almacenar en un vector sus factoriales.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creamos un array que contenga los números que introducimos
		int[] array = new  int[20];
		System.out.println("Introduce los numeros:");
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
			System.out.println("\n");
		}	
		
		//Creamos un nuevo array que contiene los factoriales del primer array
		int[] array2 = new int[20];

		//Creamos dos for 
		//El primer for para seleccionar cada posición del segundo array y almacenar la variable resultado
		for(int i=0;i<20;i++) {
			
			int resultado=1;
			for(int j=array[i];j>1;j--) {  //Segundo for para que j obtenga el valor de la posición i del array y va restando 1
				resultado = resultado * j; //Operación matemática
			}		
			array2[i]=resultado;   
		}
		
        for (int i = 0; i < 20; ++i)    //Mostrar el segundo array por pantalla
        {
        	System.out.print(array2[i]+" ");
        }      
        sc.close();
	}			
}
