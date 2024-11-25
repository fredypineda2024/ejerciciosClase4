/*
 * ## Ejercicio 6 - Conversión de Unidades
### Definir el Problema:
Necesitamos convertir unidades de longitud (metros a kilómetros y
 viceversa) y unidades de masa (gramos a kilogramos y viceversa).
### Estructura del Programa:
Crear métodos separados para cada tipo de conversión (metros a kilómetros,
 kilómetros a metros, gramos a kilogramos, kilogramos a gramos).
### Interacción con el Usuario:
Pedir al usuario que ingrese el valor y el tipo de conversión que desea realizar.
### Mostrar Resultados:
Después de realizar la conversión, mostrar el resultado al usuario en la consola.
 * 
 */

package Clase4;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer entrada del usuario.

        boolean continuar = true;

        while (continuar) {
            // Mostrar opciones al usuario
            System.out.println("Seleccione una conversión:");
            System.out.println("1. Metros a Kilómetros");
            System.out.println("2. Kilómetros a Metros");
            System.out.println("3. Gramos a Kilogramos");
            System.out.println("4. Kilogramos a Gramos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt(); // Leer la opción seleccionada.

            if (opcion == 5) {
                continuar = false; // Terminar el programa.
                System.out.println("Saliendo...");
                break;
            }

            // Pedir al usuario el valor a convertir
            System.out.print("Ingrese el valor a convertir: ");
            double valor = scanner.nextDouble();

            // Realizar la conversión según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println(valor + " metros son " + metrosAKilometros(valor) + " kilómetros.");
                    break;
                case 2:
                    System.out.println(valor + " kilómetros son " + kilometrosAMetros(valor) + " metros.");
                    break;
                case 3:
                    System.out.println(valor + " gramos son " + gramosAKilogramos(valor) + " kilogramos.");
                    break;
                case 4:
                    System.out.println(valor + " kilogramos son " + kilogramosAGramos(valor) + " gramos.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close(); // Cerrar el objeto Scanner.
    }

    // Método para convertir metros a kilómetros
    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    // Método para convertir kilómetros a metros
    public static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    // Método para convertir gramos a kilogramos
    public static double gramosAKilogramos(double gramos) {
        return gramos / 1000;
    }

    // Método para convertir kilogramos a gramos
    public static double kilogramosAGramos(double kilogramos) {
        return kilogramos * 1000;
    }

}
