package Array38;
/**
 * 
 * @author mcgca
 *
 */
public class factorial {
/**
 * Un m�todo recursivo es una declaraci�n que ejecuta una llamada a s� mismo
    El factorial de un n�mero N es la multiplicaci�n de todos los n�meros entre 1 y N	
 * @param n
 * @return
 */
	//
	int fac (int n){
		
        int res;
        //El factorial de 1 es 1
        if (n==1) return 1;
        
        //Cuando se llama a fac devulve el producto de (n-1)*n
        //El valor se almacna en resultado
        //La siguiente vez que lo llama n tiene una unidad menos y vuelve a hacer la operaci�n y almacenarlo en resultado
        //Cuando n = 1 vuelve al if y acaba el m�todo devolviendo el res final
        res = n*fac(n-1);
        return res;
    }
	
}
