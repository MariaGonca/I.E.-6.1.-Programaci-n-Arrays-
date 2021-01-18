package Array38;
/**
 * 
 * @author mcgca
 *
 */
public class factorial {
/**
 * Un método recursivo es una declaración que ejecuta una llamada a sí mismo
    El factorial de un número N es la multiplicación de todos los números entre 1 y N	
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
        //La siguiente vez que lo llama n tiene una unidad menos y vuelve a hacer la operación y almacenarlo en resultado
        //Cuando n = 1 vuelve al if y acaba el método devolviendo el res final
        res = n*fac(n-1);
        return res;
    }
	
}
