/*
 * ## Ejercicio 8 - Cálculo de Áreas
### Definir el Problema:
Necesitamos calcular el área de un círculo, un cuadrado y un triángulo utilizando
 las fórmulas matemáticas correspondientes.  
Fórmulas de Cálculo:
- **Área de un Círculo**: La fórmula es `A = pi * r ^ 2`, donde `r` es el radio del círculo.
- **Área de un Cuadrado**: La fórmula es `A = l ^ 2`, donde `l` es la longitud del 
lado del cuadrado.
- **Área de un Triángulo**: La fórmula es `A = (b * h) / 2`, donde `b` es la base y `h` 
es la altura del triángulo.
### Estructura del Programa:
Crear métodos separados para calcular el área de cada figura geométrica.  
Puede utilizar la función creada en el **ejercicio 7** para calcular los cuadrados en las formulas.
### Interacción con el Usuario:
Pedir al usuario que ingrese los valores necesarios (radio, lado, base y altura) para calcular
 el área de cada figura.
### Mostrar Resultados:
Después de calcular el área, mostrar el resultado al usuario en la consola.

 * 
 * 
 */


package Clase4;

import java.util.Scanner;
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Cálculo de Áreas ===");
            System.out.println("1. Calcular el área de un Círculo");
            System.out.println("2. Calcular el área de un Cuadrado");
            System.out.println("3. Calcular el área de un Triángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = calcularAreaCirculo(radio);
                    System.out.printf("El área del círculo es: %.2f\n", areaCirculo);
                }
                case 2 -> {
                    System.out.print("Ingresa la longitud del lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = calcularAreaCuadrado(lado);
                    System.out.printf("El área del cuadrado es: %.2f\n", areaCuadrado);
                }
                case 3 -> {
                    System.out.print("Ingresa la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = calcularAreaTriangulo(base, altura);
                    System.out.printf("El área del triángulo es: %.2f\n", areaTriangulo);
                }
                case 4 -> {
                    System.out.println("¡Gracias por usar el programa! Hasta luego.");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }

        scanner.close();
    }

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * cuadrado(radio);
    }

    // Método para calcular el área de un cuadrado
    public static double calcularAreaCuadrado(double lado) {
        return cuadrado(lado);
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular el cuadrado de un número (reutilizable)
    public static double cuadrado(double numero) {
        return numero * numero;
    }
}

