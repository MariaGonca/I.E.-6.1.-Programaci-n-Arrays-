package Array43;

public class metodos43 {

	
	public int[][] trasponer(int matriz[][]) {
		
		//Método para trasponer una matriz dada
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
				  matrizT[y][x] = matriz[x][y];
			  	}
			  }return matrizT;
	}
	
	
	
	
	
	
	
	
	
	//Método para determinar si un vector está dentro de una matriz como fila
	public int compararVectoresM(int matriz[][], int vector[]) {
		
		int fila= 0;
		
		for (int i=0;i<matriz.length;i++)
	    {
	       if(matriz[i]==vector){
	       fila = i;
	       }
	    }		
	    return fila;
	}
	
	
	
}
