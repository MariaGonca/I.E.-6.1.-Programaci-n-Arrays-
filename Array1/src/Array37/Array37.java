package Array37;
/**
 * 
 * @author mcgca
 *
 */
public class Array37 extends metodosSilla{

	public static void main(String[] args)  {
		

		/*
		 * Recorremos columnas buscando el valor mayor y
		 * a que fila pertenece.
		 * Después  comprobamos si ese valor es también el 
		 * menor de la fila a la que pertenece. 
		 */
					
		int matriz[][] = {{1,2,3,4,5},{2,7,7,7,7},{3,8,9,8,9},{1,7,7,7,7},{1,7,7,7,7}};
        //Mostrar matriz por pantalla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
        
											//HASTA AQUÍ BIEN
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(metodosSilla.esMayorColumna(matriz,i,j) == true && metodosSilla.esMenorFila(matriz,i,j) == true) {
                	System.out.println("Existe un punto de silla en ["+i+"],["+j+"] con valor "+ matriz[i][j]);
                }
            }
            System.out.println(" ");
        }
	
	}
	
	
	
	
}
