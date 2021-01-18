package Array3;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array3 {
	
static Scanner numerosTeclado = new Scanner(System.in);
/**
 * Leer un array de 10 elementos e intercambiar los elementos situados en
posiciones consecutivas (1 y 2, 3 y 4, ... , 9 y 10).
 * @param args
 */
public static void main(String[] args) {
		
		
	int[] vector3 = new int[10];
	int i;
	int aux = 0;
    int aux2 = 0;	
	System.out.println("Inserte los elementos del vector");
		
		for(i=0; i<vector3.length; i++){
			System.out.print("Número para la posición " +i+ " = ");
            vector3[i]=numerosTeclado.nextInt();
		} 
		
		//Como no se cambian posiciones consecutivas no se puede usar el incremento i++
		//El intercambio tiene que ser por parejas así que usamos i+=2
       for (i = 0; i < vector3.length; i+=2) {

           aux=vector3[i];
           aux2=vector3[i+1];

           //aux toma el valor de aux2 y aux2 el de aux
           vector3[i]=aux2;
           vector3[i+1]=aux;
       } 
       
       //mostramos por pantalla como ha resultado el cambio
       for (i=0; i<vector3.length; i++) {
    	   System.out.print(vector3[i]+ "\t");
       }
		
 }
}
