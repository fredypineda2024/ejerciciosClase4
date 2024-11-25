/*
 * ## Ejercicio 7 - Cálculo de Potencias
### Definir el Problema:
Necesitamos calcular la potencia de un número dado una base y
 un exponente. La fórmula general es `resultado = base ^ exponente`.  
Esto significa que hay que multiplicar la `base` por si mismo `exponente` veces.  
Por ejemplo:
- `2 ^ 4` = `2 * 2 * 2 * 2` = `16`
- `5 ^ 2` = `5 * 5` = `25`
- `27 ^ 1` = `27`
- `325 ^ 0` = `1`
 * Recuerda que si el exponente es `0`, la potencia es igual a `1`.
### Estructura del Programa:
Crear un método separado que realice el cálculo de la potencia.
### Interacción con el Usuario:
Pedir al usuario que ingrese la base y el exponente.
### Mostrar Resultados:
Después de calcular la potencia, mostrar el resultado al usuario en la consola.
 */

package Clase4;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        // Crear un escáner para capturar datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();

        // Solicitar al usuario que ingrese el exponente
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();

        // Llamar al método que calcula la potencia
        int resultado = calcularPotencia(base, exponente);

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

        // Cerrar el escáner
        scanner.close();
    }

    // Método para calcular la potencia
    public static int calcularPotencia(int base, int exponente) {
        // Caso especial: cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        }

        // Inicializar el resultado en 1
        int resultado = 1;

        // Multiplicar la base por sí misma 'exponente' veces
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        // Retornar el resultado calculado
        return resultado;
    }

}
