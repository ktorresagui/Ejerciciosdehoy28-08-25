public class Recursion {

    // Factorial recursivo
    public static long factorial(long n){
        if (n <= 1){   // Caso base
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    // Fibonacci recursivo
    public static long fibonacci(long n){
        if (n <= 1){   // Caso base
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Suma de dígitos recursiva
    public static int sumaDigitos(int n){
        if (n < 10){   // Caso base: un solo dígito
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);  // Separa último dígito y llama recursivamente
        }
    }
}
