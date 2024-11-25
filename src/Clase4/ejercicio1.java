
/*## Ejercicio 1 - Conversión de Temperaturas
### Definir el Problema:
Necesitamos convertir temperaturas de Celsius a Fahrenheit y viceversa.  
Operaciones para las conversiones:
- **Celsius a Fahrenheit**: La fórmula es `F = (C * (9 / 5)) + 32`.
- **Fahrenheit a Celsius**: La fórmula es `C = (F - 32) / (9 / 5)`.
### Estructura del Programa:
Crear métodos separados para cada conversión.
### Interacción con el Usuario:
Pedir al usuario que ingrese la temperatura y el tipo de conversión que desea realizar.
### Mostrar Resultados:
Mostrar el resultado de la conversión.  
Por ejemplo:
```
temperatura en Celsius: 25

La temperatura en Fahrenheit es: 77.0
```
```
Ingresa la temperatura en Fahrenheit: 77

La temperatura en Celsius es: 25.0
```
 */

package Clase4;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario.

        // Pedir al usuario el tipo de conversión
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1: Celsius a Fahrenheit");
        System.out.println("2: Fahrenheit a Celsius");
        int opcion = scanner.nextInt(); // Leer la opción ingresada.

        // Según la opción elegida, realizar la conversión
        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = scanner.nextDouble(); // Leer la temperatura en Celsius.
            double fahrenheit = celsiusAFahrenheit(celsius); // Llamar al método de conversión.
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble(); // Leer la temperatura en Fahrenheit.
            double celsius = fahrenheitACelsius(fahrenheit); // Llamar al método de conversión.
            System.out.println("La temperatura en Celsius es: " + celsius);
        } else {
            System.out.println("Opción no válida."); // Validar una entrada incorrecta.
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos.
    }

    // Método para convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * (9.0 / 5.0)) + 32; // Fórmula de conversión.
    }

    // Método para convertir Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) / (9.0 / 5.0); // Fórmula de conversión.
    }

}
