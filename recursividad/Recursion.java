public class Recursion {

    // Factorial recursivo
    public static long factorial(long n){
        if (n <= 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    // Fibonacci recursivo
    public static long fibonacci(long n){
        if (n <= 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Suma de dígitos recursiva
    public static int sumaDigitos(int n){
        if (n < 10){
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    // Invertir cadena recursiva
    public static String invertirCadena(String str){
        if (str.isEmpty()){
            return str;
        } else {
            return invertirCadena(str.substring(1)) + str.charAt(0);
        }
    }

    // Conteo de vocales recursivo
    public static int contarVocales(String str){
        if (str.isEmpty()){
            return 0;
        } else {
            char c = Character.toLowerCase(str.charAt(0));
            int suma = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
            return suma + contarVocales(str.substring(1));
        }
    }
}
