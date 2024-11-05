import java.util.Scanner;
public class ReservaVuelos {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        char[][] asientos = new char[6][6];

        // Inicializar la matriz con 'O' para representar asientos disponibles
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j] = 'O';
            }
        }

        int fila, columna;
        char opcion;
        do {
            mostrarAsientos(asientos);
            System.out.print("\nSelecciona el asiento que quieres reservar.");
            System.out.print("\nIngresa el número de fila (1-6): ");
            fila = scanner.nextInt() - 1;
            System.out.print("Ingresa el número de columna (1-6): ");
            columna = scanner.nextInt() - 1;

            // Validación de selección y reserva de asiento
            if (fila >= 0 && fila < 6 && columna >= 0 && columna < 6) {
                if (asientos[fila][columna] == 'O') {
                    asientos[fila][columna] = 'X'; // Marcar el asiento como reservado
                    System.out.println("Asiento reservado con éxito.");
                } else {
                    System.out.println("Ese asiento ya está ocupado. Por favor, elige otro.");
                }
            } else {
                System.out.println("Selección inválida. Elige una fila y columna entre 1 y 6.");
            }

            System.out.print("\n¿Deseas reservar otro asiento? (S/N): ");
            opcion = scanner.next().toUpperCase().charAt(0);
        } while (opcion == 'S');

        scanner.close();
        System.out.println("Gracias por usar el sistema de reservas.");
    }

    // Método para mostrar la disposición actual de los asientos
    public static void mostrarAsientos(char[][] asientos) {
        System.out.println("\nDisposición de Asientos:");
        System.out.print("  ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + asientos[i][j] + "]");
            }
            System.out.println();
        }
    }
}
