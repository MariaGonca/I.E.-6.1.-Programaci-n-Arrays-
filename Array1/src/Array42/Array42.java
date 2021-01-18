package Array42;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array42 {

public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int matriz[][] = {{9,2,3,4,5},{2,7,1,7,7},{3,8,9,8,9},{1,7,7,7,7},{1,7,7,7,7}};

        //Mostrar matriz por pantalla
        for (int i = 0; i < matriz.length; i++) {
        	System.out.print("Fila " + i + " ->  ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
		
		System.out.println("¿Que fila desea ordenar?");
		
		int fila = sc.nextInt();
		int vector[] = new int[5];
		
		if(fila >= 0 || fila < 5) {
			
			//guardamos la fila en un vector
            for (int j = 0; j < matriz.length; j++) {
                vector[j]= matriz[fila][j];
            }

            //ordenamos
			metodoBurbuja(vector);
			
			//sustituimos el vector por la fila de la matriz
            for (int j = 0; j < matriz.length; j++) {
            	matriz[fila][j] = vector[j];
            }
			
			System.out.println("\n\nMatriz con la fila ordenada: ");
			//Mostrar matriz por pantalla
	        for (int i = 0; i < matriz.length; i++) {
	        	System.out.print("Fila " + i + " ->  ");
	            for (int j = 0; j < matriz.length; j++) {
	                System.out.printf(" "+matriz[i][j]);
	            }
	            System.out.println(" ");
	        }   
		}
		else {
			System.out.println("No existe esa fila");
		}
		
		
		
		//ordenacion de la diagonal de la matriz
		
		//guardamos la diagonal en un vector
		for (int i = 0; i < matriz.length; i++) {
            vector[i]=matriz[i][i];
        }  

        //ordenamos
		insercionDirecta(vector);
		
		//sustituimos el vector por la fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
        	matriz[i][i] = vector[i];
        }
        
        System.out.println("\nMatriz con la diagonal ordenada: ");
		//Mostrar matriz por pantalla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
		
        sc.close();
	}
	
	
	private static void metodoBurbuja(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				int indice = vector[j];
				int indiceSiguiente = vector[j+1];
				
				if(indice > indiceSiguiente) {
					vector[j] = indiceSiguiente;
					vector[j+1] = indice;
				}
			}
		}
	}
	
	private static void insercionDirecta(int[] vector) {
		
		int i;
		int j;
		int auxiliar;
		for(i = 1; i< vector.length;i++) {
			auxiliar = vector[i];
			j = i-1;
			while((j >= 0) && (auxiliar < vector[j])) {
				vector[j+1] = vector[j];
				j--;
			}
			vector[j+1] = auxiliar;
		}
	}

	
}
