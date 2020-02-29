package primos.java;

import java.util.*;

/**
 *
 * @author Celvyn
 */
public class PrimosJava {       
    
    public static void main(String[] args) {                                       
        ArrayList<Integer> primos = new ArrayList();
        primos.add(2);
        
        ArrayList<Integer> divisores = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        
        int numero;
        int sumaPrimos = 0;
        
        System.out.println("Ingresa un número");
        
        numero = input.nextInt();
        
        int numeroAbs = Math.abs(numero);                
        
        // Encuentra los números primos
        for ( int s = 3; s <= numeroAbs; s += 2) {            
            if (Numero.esPrimo(s)) {
                continue;
            }
            primos.add(s);
        }
        
        // sumaPrimos = primos.stream().map((e) -> e).reduce(sumaPrimos, Integer::sum);
        for (int e: primos) {
            sumaPrimos += e;
        }       
        
    }
    
}
