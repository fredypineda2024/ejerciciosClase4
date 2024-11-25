/*
 * ## Ejercicio 12 - Conversión de segundos
### Definir el Problema:
Necesitamos convertir una cantidad de segundos ingresada 
por el usuario en días, horas, minutos y segundos.
### Estructura del Programa:
Crear un método separado que realice la conversión de segundos
 a días, horas, minutos y segundos.
### Interacción con el Usuario:
Pedir al usuario que ingrese la cantidad de segundos.
### Mostrar Resultados:
Después de realizar la conversión, mostrar los resultados al 
usuario en la consola. 
 
Por ejemplo:
```
Ingresa la cantidad de segundos: 100000

Días: 1
Horas: 3
Minutos: 46
Segundos: 40
```
 * 
 */

package Clase4;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        // Crear un Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese la cantidad de segundos
            System.out.print("Ingresa la cantidad de segundos: ");
            int totalSegundos = scanner.nextInt();

            // Llamar al método que realiza la conversión
            convertirSegundos(totalSegundos);
        }
    }

    // Método para convertir segundos a días, horas, minutos y segundos
    public static void convertirSegundos(int totalSegundos) {
        // Constantes para los cálculos
        final int SEGUNDOS_EN_UN_MINUTO = 60;
        final int SEGUNDOS_EN_UNA_HORA = 3600;
        final int SEGUNDOS_EN_UN_DIA = 86400;

        // Calcular días
        int dias = totalSegundos / SEGUNDOS_EN_UN_DIA;
        totalSegundos %= SEGUNDOS_EN_UN_DIA;

        // Calcular horas
        int horas = totalSegundos / SEGUNDOS_EN_UNA_HORA;
        totalSegundos %= SEGUNDOS_EN_UNA_HORA;

        // Calcular minutos
        int minutos = totalSegundos / SEGUNDOS_EN_UN_MINUTO;

        // Los segundos restantes
        int segundos = totalSegundos % SEGUNDOS_EN_UN_MINUTO;

        // Mostrar los resultados
        System.out.println("\nResultado de la conversión:");
        System.out.printf("Días: %d%n", dias);
        System.out.printf("Horas: %d%n", horas);
        System.out.printf("Minutos: %d%n", minutos);
        System.out.printf("Segundos: %d%n", segundos);
    } 
}