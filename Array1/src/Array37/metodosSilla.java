package Array37;

public class metodosSilla {

	
	static boolean esMayorColumna(int[][] matriz, int fila, int columna) {
		
		int valor = matriz[fila][columna];
		boolean esElMayor = true;
		//System.out.println("valor inicial " +matriz[fila][columna] );
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i][columna] > valor) {
				//System.out.println("Se encontro un elemento mayor en [" + i +"][" + columna +"] = " +matriz[i][columna] );
				esElMayor = false;
			}
		}
		return esElMayor;
	}
	
	static boolean esMenorFila(int[][] matriz, int fila, int columna) {
		
		int valor = matriz[fila][columna];
		boolean esElMenor = true;
		//System.out.println("valor inicial " +matriz[fila][columna] );
		for(int j=0;j<matriz.length;j++) {
			if(matriz[fila][j] < valor) {
				//System.out.println("Se encontro un elemento mayor en [" + i +"][" + columna +"] = " +matriz[i][columna] );
				esElMenor = false;
			}
		}
		return esElMenor;
	}
	
	
}
