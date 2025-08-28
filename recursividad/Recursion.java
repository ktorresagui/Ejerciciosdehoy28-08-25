// Clase Recursion con los métodos recursivos
public class Recursion {

    /**
     * Función factorial de manera recursiva.
     * @param n valor a obtener factorial
     * @return factorial de n
     */
    public static long factorial(long n){
        long result = 1;
        if (n <= 1){   // Caso base
            result = 1;
        } else {
            // Caso recursivo
            result = n * factorial(n-1);
        }
        return result;
    }

    /**
     * Función de Fibonacci de manera recursiva.
     * @param n posición en la sucesión
     * @return número de Fibonacci en la posición n
     */
    public static long fibonacci(long n){
        long result = 1;
        if (n <= 1){   // Caso base
            result = 1;
        } else {
            // Caso recursivo
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        return result;
    }
}
