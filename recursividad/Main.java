import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú con estilo de cuadro
            System.out.println("\n========================================");
            System.out.println("          MENÚ DE RECURSIVIDAD");
            System.out.println("========================================");
            System.out.println("  [1] Calcular Factorial");
            System.out.println("  [2] Calcular Fibonacci");
            System.out.println("  [3] Calcular Suma de Dígitos");
            System.out.println("  [4] Invertir una Cadena");
            System.out.println("  [5] Contar Vocales en una Cadena");
            System.out.println("  [6] Salir");
            System.out.println("========================================");
            System.out.print("Elige una opción: ");

            while (!sc.hasNextInt()) {
                System.out.println("Error: Ingresa un número válido.");
                sc.next(); // limpiar
                System.out.print("Elige una opción: ");
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            System.out.println("----------------------------------------");

            switch(opcion){
                case 1:
                    System.out.print("Ingresa un número para calcular su factorial: ");
                    int numFact = sc.nextInt();
                    System.out.println("El factorial de " + numFact + " es: " + Recursion.factorial(numFact));
                    break;

                case 2:
                    System.out.print("Ingresa la posición para calcular Fibonacci: ");
                    int numFib = sc.nextInt();
                    System.out.println("El número de Fibonacci en la posición " + numFib + " es: " + Recursion.fibonacci(numFib));
                    break;

                case 3:
                    System.out.print("Ingresa un número para calcular la suma de sus dígitos: ");
                    int numSuma = sc.nextInt();
                    System.out.println("La suma de los dígitos de " + numSuma + " es: " + Recursion.sumaDigitos(numSuma));
                    break;

                case 4:
                    System.out.print("Ingresa una cadena para invertir: ");
                    String cadena = sc.nextLine();
                    System.out.println("✔ La cadena invertida es: " + Recursion.invertirCadena(cadena));
                    break;

                case 5:
                    System.out.print("Ingresa una cadena para contar las vocales: ");
                    String texto = sc.nextLine();
                    System.out.println("La cadena \"" + texto + "\" tiene " + Recursion.contarVocales(texto) + " vocal(es).");
                    break;

                case 6:
                    System.out.println("Saliendo del programa... ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
            }
        } while(opcion != 6);

        sc.close();
    }
}
