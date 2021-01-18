package Array16;
/**
 * 
 * @author mcgca
 *
 */
public class Array16 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		int[][] matrizA = {{1,2,3},{2,3,4},{3,2,1}};
		int[][] matrizB = {{1,2,3},{2,3,4},{3,2,1}};
		int[][] matrizC = new int [3][3];   //Le doy el número de filas y el de columnas
		
		
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA.length; j++) {   
				matrizC[i][j]=matrizA[i][j]+matrizB[i][j];			
			}
		}
		
		//Para imprimirla por pantalla usamos dos estructuras for anidadas
		//La primera incrementa las filas (valor de i)
		//La segunda incrementa por cada fila el valor de las columnas, j
		for(int i=0; i<matrizC.length; i++) {
			for(int j=0; j<matrizC[i].length; j++) {  //Para elegir el valor máximo del imcremento usamos la longitud de la dimension i 
				System.out.print(matrizC[i][j]+" "); 
				//Cuando j llegue a ser la última posición añadimos un salto de línea
				if (j==matrizC[i].length-1) {System.out.print("\n");}
		}}
	}
}
