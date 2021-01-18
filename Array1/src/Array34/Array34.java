package Array34;

import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Array34 {

	/**
	 * 
	 * @param args
	 */
	
	//Hacer un programa que genere e imprima un cuadrado latino de orden N
	 
	public static void main(String[] args) {
		
		System.out.println("Para constriruir una matriz latina NxN, inserte N");
		int filas = 0;
        int columnas = 0;
        
        Scanner sc = new Scanner(System.in);
         filas = sc.nextInt();
        columnas=filas;
        
        //A partir de los valores introducidos determina la dimensión de la matriz
        int matriz[][]= new int [filas][columnas];
       
        
        for (int fil = 0; fil < filas; fil++) {
            for (int col = 0; col < columnas; col++) {
                //si es la primera fila
                if (fil==0) matriz[fil][col]=col+1;
                //si no, si es la primera columna
                else if(col==0) matriz[fil][col]= matriz[fil-1][columnas-1];
                // para el resto de casos
                else matriz[fil][col]= matriz[fil-1][col-1];
            }
        }
       
        //Imprimir la matriz resultante
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j]<10) System.out.printf("   "+matriz[i][j]);
                else System.out.printf("  "+matriz[i][j]);
            }
            System.out.println(" ");
        }
			sc.close();	} 
	
}
