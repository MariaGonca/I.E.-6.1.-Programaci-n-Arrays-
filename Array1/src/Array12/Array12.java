package Array12;
import java.util.Random;
/**
 * 
 * @author mcgca
 *
 */
public class Array12 {
/**
 * 
 * @param args
 * Realiza un programa que cree un vector de 100 posiciones con números
aleatorios entre 10 y 80. Una vez creado el vector el programa deberá mostrar
el mayor, el menor, el valor que más se repite y la media.
 */
	
	public static void main(String[] args) {
		
		Random rd = new  Random(); //Usamos Random
		int[] array = new  int[100]; //Declaramos array de 100 posiciones
		
		for(int i=0; i<array.length; i++) {
			//A rd le determinamos un rango
				array[i] = rd.nextInt(80-10)+10;
			}
	
		for(int i=0; i<array.length; i++) {  //Para mostrarlos por pantalla  
				System.out.print(array[i]+ " ");
			}
		}
	}
