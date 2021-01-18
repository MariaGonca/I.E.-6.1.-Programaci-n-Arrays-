package Array39;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class Fibonacci {
/**
 * 
 * @param n
 * @return
 * La sucesi�n de Fibonacci se realiza sumando siempre
 * los �ltimos 2 n�meros. Epezando como: 0,1,1,2,3,5...
 * 
 */
	static int fibonacciRec(int n) {
		
		//Si la serie s�lo tiene un d�gito, ese d�gito es 1
		if (n<2) return n;	
		//En res se almacena la suma de el n�mero de posici�n de los dos anteriores
		/**
		 * por ejemplo, para n=7, el n�mero que ocupa esta posici�n es la suma
		 * de los dos n�meros anteriores, el que ocupa la posici�n 6 (n-1)
		 * y el que ocupa la posici�n 5 (n-2)
		 */
		int res = fibonacciRec(n-1)+ fibonacciRec(n-2);
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte cantidad de valores a mostrar en la serie Fibonacci");
		int num = 0;
		num=sc.nextInt();
		
	//No se permiten los n�meros negativos ni el 0
		while(num<=0) {
			System.out.println("Una serie no puede tener 0 o menos d�gitos");
			System.out.println("Introd�celo de nuevo");
			num=sc.nextInt();
		}
		sc.close();
		for(int i = 0;i<num;i++) {
			System.out.print(fibonacciRec(i)+" ");
		}
		
		
	}
	
	
}