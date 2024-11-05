import java.util.Scanner;

public class Employee {
    public static void main (String[]args)
    {
        String[] empleados = new String[5];
        int[] calificaciones = new int[5];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Por favor, ingresa el nombre del empleado " + (i + 1) + ":");
            empleados[i] = scanner.nextLine(); // Asignar nombre

            int calificacion;
            do {
                System.out.println("Por favor, asigna una calificación de desempeño (1-10) para " + empleados[i] + ":");
                calificacion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
            } while (calificacion < 1 || calificacion > 10);
            calificaciones[i] = calificacion; // Asignar calificación
        }


        int mayorCalificacion = Integer.MIN_VALUE;
        int menorCalificacion = Integer.MAX_VALUE;
        String empleadoMayor = "";
        String empleadoMenor = "";


        for (int i = 0; i < empleados.length; i++) {
            int calificacionActual = calificaciones[i];

            // Buscar la calificación mayor
            if (calificacionActual > mayorCalificacion) {
                mayorCalificacion = calificacionActual;
                empleadoMayor = empleados[i];
            }

            // Buscar la calificación menor
            if (calificacionActual < menorCalificacion) {
                menorCalificacion = calificacionActual;
                empleadoMenor = empleados[i];
            }
        }

        // Imprimir la calificación mayor y menor
        System.out.println("\nLa calificación mayor es " + mayorCalificacion + " por " + empleadoMayor);
        System.out.println("La calificación menor es " + menorCalificacion + " por " + empleadoMenor);


        scanner.close();

    }
}
