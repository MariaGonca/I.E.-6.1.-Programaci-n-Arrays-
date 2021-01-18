package Array38;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class PruebaFactorial  {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número del que deseas saber su factorial ");
		int num;
		num = sc.nextInt();	
		
		while(num<=0) {
			System.out.println("Una serie no puede ser 0 o menor");
			System.out.println("Introdúcelo de nuevo");
			num=sc.nextInt();
		}
		
		factorial f= new factorial();
		System.out.println("El factorial de "+num+" es "+f.fac(num));
		
		sc.close();
	}
}
