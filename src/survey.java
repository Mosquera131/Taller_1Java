import java.util.Scanner;

public class survey {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        // Arreglo para almacenar las respuestas de los clientes
        int[] calificaciones = new int[10];

        // Leer las calificaciones de satisfacción
        for (int i = 0; i < calificaciones.length; i++) {
            int calificacion;
            do {
                System.out.print("Por favor, califica tu satisfacción del 1 al 5 (Cliente " + (i + 1) + "): ");
                calificacion = scanner.nextInt();
            } while (calificacion < 1 || calificacion > 5); // Asegura que la calificación esté entre 1 y 5

            calificaciones[i] = calificacion; // Guarda la calificación en el arreglo
        }

        // Variables para calcular el promedio y contar las calificaciones máximas
        int suma = 0;
        int conteoMaximas = 0;

        // Calcular la suma de todas las calificaciones y contar cuántos dieron la calificación máxima (5)
        for (int calificacion : calificaciones) {
            suma += calificacion;
            if (calificacion == 5) {
                conteoMaximas++;
            }
        }

        // Calcular el promedio de satisfacción
        double promedio = (double) suma / calificaciones.length;

        // Mostrar los resultados
        System.out.printf("Promedio de satisfacción: %.2f%n", promedio);
        System.out.println("Cantidad de clientes que dieron la calificación máxima (5): " + conteoMaximas);

        // Cerrar el escáner
        scanner.close();
    }
}
