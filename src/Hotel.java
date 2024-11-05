import java.util.Scanner;

public class Hotel {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);

        // Inicializamos una matriz 4x4 para las habitaciones
        String[][] habitaciones = new String[4][4];
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                habitaciones[i][j] = "O"; // Todas las habitaciones están disponibles inicialmente
            }
        }

        System.out.println("Sistema de Reservas de Hotel");

        while (true) {
            mostrarHabitaciones(habitaciones);

            System.out.println("Seleccione una habitación para reservar (filas y columnas van del 1 al 4):");
            System.out.print("Ingrese el número de fila: ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingrese el número de columna: ");
            int columna = scanner.nextInt() - 1;

            // Validación de los índices
            if (fila < 0 || fila >= 4 || columna < 0 || columna >= 4) {
                System.out.println("Número de habitación no válido. Intente de nuevo.");
                continue;
            }

            // Reservar habitación si está disponible
            if (habitaciones[fila][columna].equals("O")) {
                habitaciones[fila][columna] = "X"; // Marcar como ocupada
                System.out.println("Habitación reservada con éxito.");
            } else {
                System.out.println("La habitación ya está ocupada. Por favor, elija otra.");
            }

            System.out.println("¿Desea hacer otra reserva? (si/no)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Estado final de las habitaciones:");
        mostrarHabitaciones(habitaciones);
        scanner.close();
    }

    // Método para mostrar el estado de las habitaciones
    public static void mostrarHabitaciones(String[][] habitaciones) {
        System.out.println("Estado de las habitaciones:");
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                System.out.print(habitaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
