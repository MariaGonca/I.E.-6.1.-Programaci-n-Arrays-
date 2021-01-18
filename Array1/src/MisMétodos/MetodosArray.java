package MisMétodos;

import java.util.Random;

public class MetodosArray {

	//Crear un array (vector) de valores aleatorios dentro de un rango
	static public int[] arrayAleatorio(int numeros, int minimo, int maximo) {
		
		Random rd = new  Random();
		int[] array = new int[numeros];
		
		for(int i=0; i<array.length; i++) {
			array[i] = rd.nextInt(maximo-minimo)+minimo;
		}
		
		return array;
	}
	
	
	
	
	
	
	//Método para intercambiar el valor menor de matriz A por el mayor de B 
	static public void intercambiarMaxMinArray(int a[][], int b[][]) {
		
		int menor;
		menor = a[0][0];

		int mayor;
		mayor = b[0][0];
		
		for(int i= 0; i<a.length; i++) {   //Identifica cuáles son los valores mayor y menor
			for(int j=0; j<a[i].length; j++) {
				if(menor>a[i][j]) {
					menor=a[i][j];
				}
				if (mayor<b[i][j]) {
					mayor=b[i][j];
				}
			}}
				
		System.out.println("El mayor es "+mayor+ ", y el menor es " + menor);
		
		for(int i= 0; i<a.length; i++) {  //Intercambia los valores
			for(int j=0; j<a[i].length; j++) {	
				if(a[i][j]==menor) {
					a[i][j]=mayor;
				}
				if(b[i][j]==mayor) {
					b[i][j]=menor;
				}		
			}}
		
		for(int i= 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {	
				System.out.print(a[i][j]+" ");
				if (j==a[i].length-1) System.out.print("\n");
			}}
		
		System.out.println(" ");
		
		for(int i= 0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {	
				System.out.print(b[i][j]+" ");
				if (j==b[i].length-1) System.out.print("\n");
			}}	
	}
	
	
	
	
	
	
	
	
	//Método que invierte la diagonal principal de una matriz
	static public void invertirDiagonal(int mDiagonal[][]) {
		
		for(int i=0; i<mDiagonal.length/2; i++) {
			for(int j=0; j<mDiagonal[i].length/2; j++) {
				if (i==j) {
					int aux = mDiagonal[i][j];
					mDiagonal[i][j]=mDiagonal[mDiagonal.length-i-1][mDiagonal.length-i-1];
					mDiagonal[mDiagonal.length-i-1][mDiagonal.length-i-1]=aux;
				}
			}
		}
		
		for(int i= 0; i<mDiagonal.length; i++) {
			for(int j=0; j<mDiagonal[i].length; j++) {	
				System.out.print(mDiagonal[i][j]+" ");
				if (j==mDiagonal[i].length-1) System.out.print("\n");
			}}
		
	}
		
	
	
	
	//Indica si un array dim1 está contenido en otro de dim2
		static public void array12Contenido(int B[], int A[][]) {
			
			int num = 0;
			int i,j;
			
			for(i=0; i<A.length; i++) {
				for(j=0; j<A[i].length; j++) {
					if(A[i][j]==B[j]) {
						num++;
					}	
		     	}	
		     }
		
			if(num==B.length) {
			System.out.println("El array de una dimensión se encuentra dentro del array de dos dimensiones");
			
			}else {
			System.out.println("El array de una dimensión no se encuentra dentro del array de dos dimensiones");
			}		
	     }
	
	
		

		
		
		//Cuenta las vocales de un String
		static public int contarVocales(String Palabra) {
			
			int c = 0;
			for(int i=0;i<Palabra.length();i++) {
				if((Palabra.charAt(i)=='a')||(Palabra.charAt(i)=='e')||(Palabra.charAt(i)=='i')||(Palabra.charAt(i)=='o')||(Palabra.charAt(i)=='u')){
					c++;
				}
			}
			
			return c;
		}
		
		
		
		
		
		//Cuenta las letras de un String
		static public int cuentaLetras(String nLetras) {
			
			int contador = 0;
			for(int i=0;i<nLetras.length();i++) {
				contador++;
			}
			return contador;		
		}
	
		
		
		
		
		
		
		//Aplica el método César (número de posiciones a rotar a elegir)
		static public void Cesar(String cadena, int posiciones) {
			
			//StringBuilder crea cadena de carácteres mutables
			StringBuilder cifrado = new StringBuilder();
			int i;
			
			for(i= 0; i<cadena.length(); i++) {
				
				//Para minúsculas
				if(cadena.charAt(i)>='a' && cadena.charAt(i)<='z') {
					if ((cadena.charAt(i) + posiciones) > 'z') { //Controla si al sumar las posiciones pasa la z
					cifrado.append((char)(cadena.charAt(i)+posiciones-26));
					}else { //En caso de que la nueva posición no supere z
					cifrado.append((char)(cadena.charAt(i)+posiciones));
					}
				
				//Para mayúsculas
				}else if(cadena.charAt(i)>='A' && cadena.charAt(i)<='Z') {
					if((cadena.charAt(i)+posiciones)>'Z') {
					cifrado.append((char)(cadena.charAt(i)+posiciones-26));
					}else {
					cifrado.append((char)(cadena.charAt(i)+posiciones));
					}
				}
			}	
			
		System.out.print(cifrado);		
	}
		
		
	
		
		
		
		
		
		//Comprueba que String sólo tiene letras y espacios
		//Retorna boolean true si lo es
		static public boolean esSoloLetras(String cadena)
		{
			//Comprobamos si cada caracter es una letra o un espacio.
			//Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
			//Si está fuera del rango 65 - 90, es que no son letras.
			//165 es el valor de Ñ (mayúscula). 32 espacio
			
			for (int i = 0; i < cadena.length(); i++)
			{
				
				//Pasamos todos los caracteres alfabéticos a mayúsculas
				// Las posiciones desde A a Z son de 65 a 90
				char caracter = cadena.toUpperCase().charAt(i);
				int valorASCII = (int)caracter;
				
				//Si los caracteres están fuera del rango del comentario anterior
				//quiere decir que la cadena introducida no solo tiene letras
				if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90) &&valorASCII != 32)
					return false; //Se ha encontrado un caracter que no es letra
			}
	 
			//Terminado el bucle sin que se haya retornado false, es que todos los caracteres son letras
			return true;
		}
		
		
		
		
		
		
		static public String invertirString(String palabra) {
			
				
				StringBuilder stringInvertido = new StringBuilder();
				for(int i= palabra.length()-1; i>=0; i--) {
					//i toma el char de la última posición de el String pasado como parámetro
					//y lo almacena en el nuevo String
					stringInvertido.append((char)palabra.charAt(i));
				}
				String palabraInvertida = stringInvertido.toString();
				return palabraInvertida;
		}
		
		
		
		
		
		
		
		//Toma dos String. Si son iguales retorna boolean true, en caso contrario salso
		static public boolean palindromo(String noInvertido, String Invertido) {
			
			boolean valor = false;
			if(Invertido.equals(noInvertido)) {
				valor = true;
			}
			return valor;
		}
		
		
		
		
		
		
		static public boolean soloNumeros(int numero) {
			boolean esNum = true;
			String numeroStr = String.valueOf(numero);
			for(int i=0; i<numeroStr.length(); i++) {
				int x = numeroStr.charAt(i);
				if (x<48 || x>57) {
					esNum = false;
				}
			}
			return esNum;
		}
		
		
		
		
		static public boolean esCapicua(int numero) {
			boolean inv = false;
			int numeroInvertido=0;
			int res = 0;
			int aux = numero;
			while(numero!=0) {
				res = numero%10;
				numeroInvertido = (numeroInvertido*10 + res);
				numero/=10;
			}
			if(numeroInvertido == aux) {
				inv = true;
			}
			return inv;
		}
		
		
		static public void esCapicua333(int numero) {
			//boolean inv = true;
			int numeroInvertido=0;
			int res = 0;
			while(numero!=0) {
				res = numero%10;
				numeroInvertido = (numeroInvertido*10 + res);
				numero/=10;
			}
			//if(numeroInvertido != numero) {
				//inv = false;
			//}
			System.out.println(numeroInvertido);
		}
		
		
		
			
	}
		
		
		
		
		
		
		
		
		
	
	
	
	

