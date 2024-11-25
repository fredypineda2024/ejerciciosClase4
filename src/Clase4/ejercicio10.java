/*
 * ## Ejercicio 10 - Generación de Tablas de Multiplicar
### Definir el Problema:
Necesitamos generar la tabla de multiplicar de un número dado 
por el usuario, mostrando los resultados desde 1 hasta 10.
### Estructura del Programa:
Crear un método separado que genere y muestre la tabla de multiplicar.  
Usa `printf` para formatear la salida del programa.
### Interacción con el Usuario:
Pedir al usuario que ingrese el número para el cual desea generar la tabla de multiplicar.
### Mostrar Resultados:
Después de generar la tabla de multiplicar, mostrar los resultados al usuario en la consola.  
Por ejemplo::
```
Ingrese el número para generar la tabla: 15

15 x 1 = 15
15 x 2 = 30
...
15 x 10 = 150
```
Generación de Tablas de Multiplicar: Crea un método que genere la tabla de multiplicar de un número dado.
 * 
 */

package Clase4;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Generador de Tabla de Multiplicar ===");
        System.out.print("Ingrese un número para generar la tabla: ");
        int numero = scanner.nextInt();

        generarTablaMultiplicar(numero);

        scanner.close();
    }

    public static void generarTablaMultiplicar(int numero) {
        System.out.printf("\nTabla de multiplicar del %d:\n", numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }
}
