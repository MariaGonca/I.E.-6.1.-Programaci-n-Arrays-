package Array17;
/**
 * 
 * @author mcgca
 *
 */
public class Array17 {
/**
 * 
 * @param args
 * Dado una matriz determinar la posici�n (i, j) del mayor y menor.
 * 
 */
	public static void main(String[] args) {
		
		//Se declara el array R, numMayor, numMenor y auxiliar r
		int[][] R = {{1,2,3},{4,90,7},{3,2,7}};
		int numMenor;
		int numMayor;
		int r;
		
		//Suponemos que numMayor y numMenor son el mismo y se encuentran en la posici�n 0,0
		numMenor = numMayor = R[0][0];
		
		//Hacemos el recorrido de la matriz y almacnamos el valor de cada posici�n en r
		for(int i=0; i<R.length; i++) {
			for(int j=0; j<R.length; j++) {
				r = R[i][j];
				
				//Despu�s antes e salir de los for anidados comparamos r con numMayor y menor
				//Si se cumple la condici�n se actializa el valor de mayor/menor
				if (r<numMenor) {
					numMenor = r;
				}
				
				if (r>numMayor) {
					numMayor = r;
				}
			}	
		}	
		System.out.print("El mayor n�mero de la matriz es "+numMayor+" y el menor es "+numMenor); 
	}
}



//Dado una matriz determinar la posici�n (i, j) del mayor y menor.