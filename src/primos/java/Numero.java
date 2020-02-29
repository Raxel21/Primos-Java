package primos.java;

/**
 *
 * @author Celvyn
 */
public class Numero {
    /**
     * Función para determinar si un número es primo
     * @param s número entero
     * @return verdadero si el número no es primo, falso si el número es primo     
     */
    public static boolean esPrimo(int s) {
        for ( int m = 3; m < s; m += 2) {
            int residuo = s % m;
            if (residuo == 0) {
                return true;
            }
        }
        return false;
    }        
}
