/*
 * ## Ejercicio 4 - Números Primos
### Definir el Problema:
Un número primo es un número entero mayor que 1 que solo es divisible por 1 y por sí mismo.  
Ejemplos de números primos: 2, 3, 5, 7, 11, 13, etc.
### Estructura del Programa:
Crear un método separado que realice la verificación de si un número es primo.
### Interacción con el Usuario:
Pedir al usuario que ingrese un número entero positivo.
### Mostrar Resultados:
Después de verificar si el número es primo, mostrar el resultado al usuario en la consola.  
Por ejemplo:
```
Ingresa un número: 29

El número 29 es primo.
```
```
Ingresa un número: 30

El número 30 no es primo.
```
 */

package Clase4;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.

        // Pedir al usuario que ingrese un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt(); // Leer el número ingresado por el usuario.

        // Verificar si el número es válido
        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            // Llamar al método esPrimo para verificar si el número es primo
            boolean esPrimo = esPrimo(numero);

            // Mostrar el resultado
            if (esPrimo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos.
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        // Recorrer todos los números desde 2 hasta la raíz cuadrada de n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Verificar si n es divisible por i
            if (n % i == 0) {
                return false; // Si es divisible, no es primo.
            }
        }
        return true; // Si no se encontró divisor, es primo.
    }

}
