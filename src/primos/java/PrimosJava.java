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
        
        Scanner input = new Scanner(System.in);
        
        int numero;
        int sumaPrimos = 0;
        
        System.out.println("Ingresa un número");
        
        numero = input.nextInt();
        
        int numeroAbs = Math.abs(numero);
        
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
        System.out.println(primos);
        System.out.println(sumaPrimos);
        
        if (Numero.esPrimo(5)) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }
    
}
