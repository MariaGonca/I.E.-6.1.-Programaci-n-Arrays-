package Array36;
import java.util.*;
public class metodosSopa {

	static Random ran = new Random();
	
	public static void horizontalIzqDer(String sopa[][], String palabra) {
		
		
		int fila=  ran.nextInt();
		int columna = ran.nextInt();
		
		for(int i=0; i<palabra.length();i++) {
			
			sopa[fila][columna+i]=""+palabra.charAt(i);
			}
		}
	
	
}
