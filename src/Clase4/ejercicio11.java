/*
 *## Ejercicio 11 - Cálculo de Índice de Masa Corporal
### Definir el Problema:
El Índice de Masa Corporal (IMC) es una medida que se utiliza 
para determinar si una persona tiene un peso saludable en relación con su altura.  
La fórmula para calcular el IMC es: `IMC = (peso_kg / altura_m) ^ 2`.
#### Categorías del IMC:
- **Bajo peso**: IMC < 18.5
- **Peso normal**: IMC entre 18.5 y 24.9
- **Sobrepeso**: IMC entre 25 y 29.9
- **Obesidad**:
    - **Grado I**: IMC entre 30 y 34.9
    - **Grado II**: IMC entre 35 y 39.9
    - **Grado III**: IMC ≥ 401
### Estructura del Programa:
- Crear un método separado que realice el cálculo del IMC.
- Crear un método separado que determine la categoría del IMC 
basado en el valor calculado.
### Interacción con el Usuario:
Pedir al usuario que ingrese su peso en kilogramos y su altura en metros.
### Mostrar Resultados:
Después de calcular el IMC y determinar la categoría, mostrar los 
resultados al usuario en la consola. 
 
Por ejemplo:
```
Ingresa tu peso en kilogramos: 70
Ingresa tu altura en metros: 1.75

Tu IMC es: 22.86
Categoría: Peso normal
```
```
Ingresa tu peso en kilogramos: 85
Ingresa tu altura en metros: 1.60

Tu IMC es: 33.20
Categoría: Obesidad grado I
``` 
 * 
 */

package Clase4;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        // Declarar el Scanner dentro de un bloque try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicitar peso al usuario
            System.out.print("Ingresa tu peso en kilogramos: ");
            double peso = scanner.nextDouble();

            // Solicitar altura al usuario en centímetros
            System.out.print("Ingresa tu altura en centímetros: ");
            double alturaCm = scanner.nextDouble();

            // Convertir altura de centímetros a metros
            double alturaM = alturaCm / 100;

            // Calcular el IMC
            double imc = calcularIMC(peso, alturaM);

            // Determinar la categoría del IMC
            String categoria = determinarCategoriaIMC(imc);

            // Mostrar los resultados
            System.out.printf("Tu IMC es: %.2f%n", imc);
            System.out.println("Categoría: " + categoria);
        } // El Scanner se cerrará automáticamente al salir del bloque try
    }

    // Método para calcular el IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para determinar la categoría del IMC
    public static String determinarCategoriaIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidad grado I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III";
        }
    }
}
