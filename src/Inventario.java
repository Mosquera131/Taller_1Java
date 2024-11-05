
import java.util.Scanner;
public class Inventario {
    public static void main(String[]arg)
    {
        Scanner scanner = new Scanner(System.in);

        // Inicialización de arreglos para almacenar hasta 100 productos y precios
        String[] nombresProductos = new String[100];
        double[] preciosProductos = new double[100];
        int contadorProductos = 0;

        int opcion;
        do {
            System.out.println("\nSistema de Control de Inventario");
            System.out.println("1. Agregar producto y precio");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    if (contadorProductos < nombresProductos.length) {
                        agregarProducto(nombresProductos, preciosProductos, contadorProductos, scanner);
                        contadorProductos++;
                    } else {
                        System.out.println("Inventario lleno. No se pueden agregar más productos.");
                    }
                    break;
                case 2:
                    mostrarInventario(nombresProductos, preciosProductos, contadorProductos);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para agregar un producto y su precio
    public static void agregarProducto(String[] nombres, double[] precios, int indice, Scanner scanner) {
        System.out.print("Ingresa el nombre del producto: ");
        nombres[indice] = scanner.nextLine();
        System.out.print("Ingresa el precio del producto: ");
        precios[indice] = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Producto agregado exitosamente.");
    }

    // Método para mostrar el inventario
    public static void mostrarInventario(String[] nombres, double[] precios, int contador) {
        System.out.println("\nInventario de Productos:");
        for (int i = 0; i < contador; i++) {
            System.out.printf("Producto: %s - Precio: $%.2f%n", nombres[i], precios[i]);
        }
    }
}
