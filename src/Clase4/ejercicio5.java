/*
 * # Ejercicio 5 - Cálculo de Promedio de tres números
### Definir el Problema:
El promedio de tres números se calcula sumando los tres números 
y dividiendo el resultado entre 3.
### Estructura del Programa:
Crear un método separado que realice el cálculo del promedio.
### Interacción con el Usuario:
Pedir al usuario que ingrese tres números.
### Mostrar Resultados:
Después de calcular el promedio, mostrar el resultado al usuario en la consola.  
Por ejemplo:
```
Ingresa el primer número: 10
Ingresa el segundo número: 20
Ingresa el tercer número: 30

El promedio de los tres números es: 20.0
```
```
Ingresa el primer número: 5
Ingresa el segundo número: 15
Ingresa el tercer número: 25

El promedio de los tres números es: 15.0
```
 * 
 */

package Clase4;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer entrada del usuario.

        // Pedir al usuario los tres números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble(); // Leer el primer número.

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble(); // Leer el segundo número.

        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble(); // Leer el tercer número.

        // Calcular el promedio llamando al método calcularPromedio
        double promedio = calcularPromedio(num1, num2, num3);

        // Mostrar el resultado del promedio
        System.out.println("El promedio de los tres números es: " + promedio);

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos.
    }

    // Método para calcular el promedio de tres números
    public static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3; // Sumar los tres números y dividir entre 3.
    }

}
