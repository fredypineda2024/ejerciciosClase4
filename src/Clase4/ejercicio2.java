/*## Ejercicio 2 - Verificación de Palíndromos
### Definir el Problema:
Un palíndromo es una palabra, frase o secuencia de caracteres que se lee igual de izquierda a derecha que de derecha a izquierda, ignorando espacios, puntuación y mayúsculas.  
Ejemplos: 
- radar
- anilina
- A man, a plan, a canal, Panama
### Estructura del Programa:
Crear un método separado que realice la verificación de si una cadena es un palíndromo.
### Interacción con el Usuario:
Pedir al usuario que ingrese una cadena de texto.
### Mostrar Resultados:
Después de verificar si la cadena es un palíndromo, mostrar el resultado al usuario en la consola.  
Por ejemplo:
```
Ingresa una cadena de texto: A man, a plan, a canal, Panama

La cadena es un palíndromo.
```
```
Ingresa una cadena de texto: Hola

La cadena no es un palíndromo.
```
 */

package Clase4;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario.

        // Pedir al usuario una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine(); // Leer la cadena completa ingresada por el usuario.

        // Llamar al método que verifica si la cadena es un palíndromo
        if (esPalindromo(texto)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close(); // Cerrar el Scanner para liberar recursos.
    }

    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Eliminar espacios, puntuación y convertir todo a minúsculas
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Crear una cadena invertida
        String textoInvertido = new StringBuilder(textoLimpio).reverse().toString();

        // Comparar el texto limpio con el texto invertido
        return textoLimpio.equals(textoInvertido);
    }
}
