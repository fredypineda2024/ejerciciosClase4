/*
 * ## Ejercicio 9 - Cálculo de Intereses (simple y compuesto)
### Definir el Problema:
- **Interés Simple**: El interés se calcula solo sobre el capital inicial
 durante todo el período.
- **Interés Compuesto**: El interés se calcula sobre el capital inicial más
 los intereses acumulados en cada período.
#### Fórmulas de Cálculo:
- **Interés Simple**: La fórmula es `I = P * r * t`, donde:
    - `I` es el interés.
    - `P` es el capital inicial.
    - `r` es la tasa de interés anual.
    - `t` es el tiempo en años.
- **Interés Compuesto**: La fórmula es `A = P * (1 + (r / n) ^ (n * t))`, donde:
    - `A` es el monto total después del tiempo `t`.
    - `P` es el capital inicial.
    - `r` es la tasa de interés anual.
    - `n` es el número de veces que se aplica el interés compuesto por año.
    - `t` es el tiempo en años.
### Estructura del Programa:
Crear métodos separados para calcular el interés simple y el interés compuesto.  
Puede utilizar la función creada en el **ejercicio 7** para calcular los cuadrados
 en las formulas.
### Interacción con el Usuario:
Pedir al usuario que ingrese el capital inicial, la tasa de interés, el tiempo y,
 en el caso del interés compuesto, el número de veces que se aplica el interés por año.
### Mostrar Resultados:
Después de calcular los intereses, mostrar los resultados al usuario en la consola.  
Por ejemplo:
- Interés Simple
  ```
  Ingresa el monto de capital: 1000
  Ingresa la tasa de interés anual (en porcentaje): 5
  Ingresa el tiempo (en años): 3
  
  El interés simple es: 150.0
  ```
- Interés compuesto
  ```
  Ingresa el monto de capital: 1000
  Ingresa la tasa de interés anual (en porcentaje): 5
  Ingresa el tiempo (en años): 3
  Ingresa el número de veces que se aplica el interés por año: 4
  
  El monto total después de 3 años es: 1157.6250000000002
  El interés compuesto es: 157.62500000000023
  ```
 * 
 */


package Clase4;
import java.util.Scanner;
public class ejercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    while (!salir) {
        System.out.println("\n=== Cálculo de Intereses ===");
        System.out.println("1. Calcular Interés Simple");
        System.out.println("2. Calcular Interés Compuesto");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingresa el monto de capital inicial (P): ");
                double capital = scanner.nextDouble();
                System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
                double tasa = scanner.nextDouble() / 100; // Convertir porcentaje a decimal
                System.out.print("Ingresa el tiempo (en años): ");
                double tiempo = scanner.nextDouble();

                double interesSimple = calcularInteresSimple(capital, tasa, tiempo);
                System.out.printf("El interés simple es: %.2f\n", interesSimple);
            }
            case 2 -> {
                System.out.print("Ingresa el monto de capital inicial (P): ");
                double capital = scanner.nextDouble();
                System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
                double tasa = scanner.nextDouble() / 100; // Convertir porcentaje a decimal
                System.out.print("Ingresa el tiempo (en años): ");
                double tiempo = scanner.nextDouble();
                System.out.print("Ingresa el número de veces que se aplica el interés por año (n): ");
                int vecesPorAno = scanner.nextInt();

                double montoTotal = calcularInteresCompuesto(capital, tasa, tiempo, vecesPorAno);
                double interesCompuesto = montoTotal - capital;
                System.out.printf("El monto total después de %.2f años es: %.2f\n", tiempo, montoTotal);
                System.out.printf("El interés compuesto es: %.2f\n", interesCompuesto);
            }
            case 3 -> {
                System.out.println("¡Gracias por usar el programa! Hasta luego.");
                salir = true;
            }
            default -> System.out.println("Opción inválida. Intenta nuevamente.");
        }
    }
    scanner.close();
}

public static double calcularInteresSimple(double capital, double tasa, double tiempo) {
    return capital * tasa * tiempo;
}

public static double calcularInteresCompuesto(double capital, double tasa, double tiempo, int n) {
    return capital * Math.pow(1 + (tasa / n), n * tiempo);
}
}
