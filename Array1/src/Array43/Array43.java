package Array43;
import java.util.*;
/**
 * 
 * @author mcgca
 *
 */
public class Array43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = {{1,2,3,4,5},{2,7,7,7,7},{3,8,9,8,9},{1,7,7,7,7},{1,7,7,7,7}};

        //Mostrar matriz por pantalla
        for (int i = 0; i < matriz.length; i++) {
        	System.out.print("Fila " + i + " ->  ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
        
        int vector[] = new int[matriz.length];
        
        //Introducimos el vector que podra ser igual que la columna de la matriz
        for(int i=0;i<matriz.length;i++) {
        	System.out.print("\nIntroduce el valor de la posicion [" + i + "] del vector :");
        	vector[i] = sc.nextInt();
        }
        
        //mostramos el vector por pantalla
        System.out.print("vector =");
        for(int i=0;i<matriz.length;i++) {
        	System.out.print(" " +vector[i]);
        }
        System.out.println("\n\nSe busca alguna columna igual al vector.");
        
        
        int opcion = 0;
        
        //Buscamos una columna que sea igual al vector
        //por defecto devolvera -1 si no encuentra ninguna columna igual
        int columnaIgual = existeColumnaIgual(matriz,vector);
             
        if(columnaIgual != -1) {
        	
        	System.out.println("Selecciona un metodo de ordenacion: ");
        	System.out.println("1) Insercion directa");
        	System.out.println("2) Metodo burbuja");
        	
        	//seleccionamos el metodo de ordenacion y ordenamos
        	while(opcion != 1 && opcion != 2) {
        		opcion = sc.nextInt();
        	}
        	System.out.println("Seleccionado metodo " + opcion);
        	
        	if(opcion == 1) {
        		insercionDirecta(vector);
        	}
        	else {
        		metodoBurbuja(vector);
        	}
        	
        	
        	//mostramos el vector ordenado por pantalla
        	System.out.print("vector ordenado =");
            for(int i=0;i<matriz.length;i++) {
            	System.out.print(" " +vector[i]);
            }
            
            System.out.println("\nSe sustituye la columna por el vector ordenado y se muestra la matriz.");
            
            //sustituimos en la matriz los valores de la columna por los del vector
            for(int i=0;i<matriz.length;i++) {
            	matriz[i][columnaIgual] = vector[i];
            }
            
          //Mostramos matriz por pantalla
            for (int i = 0; i < matriz.length; i++) {
            	System.out.print("Fila " + i + " ->  ");
                for (int j = 0; j < matriz.length; j++) {
                    System.out.printf(" "+matriz[i][j]);
                }
                System.out.println(" ");
            }
            
            
        }else {
        	System.out.println("No existia ninguna columna igual");
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

	private static int existeColumnaIgual(int[][] matriz, int[] vector) {
		
		boolean columnaIgual = true;
		boolean salir = false;
		int columna = -1;
		
		for(int j=0;j<matriz.length && salir == false;j++) {
			columnaIgual=true;
			for(int i=0;i<matriz.length && columnaIgual == true;i++) {
				if(vector[i] != matriz[i][j]) {
					columnaIgual = false;
				}
			}
			if(columnaIgual==true) {
				System.out.println("La columna " + j + " es igual que el vector\n");
				columna = j;
				salir=true;
			}
		}

		
		return columna;
		
	}
	
}
