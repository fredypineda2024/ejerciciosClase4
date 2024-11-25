/*
 * ## Ejercicio 3 - Cálculo de Factorial
### Definir el Problema:
El factorial de un número entero positivo `n` (denotado como `n!`) es el
 producto de todos los enteros positivos desde 1 hasta `n`.  
Por ejemplo:  
```
3! = 3 * 2 * 1 = 6
5! = 5 * 4 * 3 * 2 * 1 = 120
```
### Estructura del Programa:
Crear un método separado que realice el cálculo del factorial.
### Interacción con el Usuario:
Pedir al usuario que ingrese un número entero positivo.
### Mostrar Resultados:
Después de calcular el factorial, mostrar el resultado al usuario en la consola.

 */

package Clase4;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.

        // Pedir al usuario que ingrese un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt(); // Leer el número ingresado por el usuario.

        // Verificar si el número es positivo
        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            // Calcular el factorial llamando al método calcularFactorial
            long factorial = calcularFactorial(numero);

            // Mostrar el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos.
    }

    // Método que calcula el factorial de un número
    public static long calcularFactorial(int n) {
        long resultado = 1; // Inicializar el resultado en 1, ya que es el valor neutro de la
                            // multiplicación.

        // Ciclo para multiplicar los números desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            resultado *= i; // Multiplicar el resultado actual por el valor de i.
        }

        return resultado; // Devolver el resultado calculado.

    }
}
