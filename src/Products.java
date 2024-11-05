import java.util.Scanner;

public class Products {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);


        String[] productos = new String[10]; // límite inicial de 10 productos
        int[] cantidades = new int[10];

        int numProductos = 0;

        while (true) {
            System.out.println("\nOpciones del Sistema de Inventario:");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar cantidad de un producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (numProductos < productos.length) {
                        System.out.print("Ingresa el nombre del producto: ");
                        String nombreProducto = scanner.nextLine();
                        System.out.print("Ingresa la cantidad en stock: ");
                        int cantidadProducto = scanner.nextInt();
                        scanner.nextLine();

                        productos[numProductos] = nombreProducto;
                        cantidades[numProductos] = cantidadProducto;
                        numProductos++;

                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("Inventario completo. No se pueden agregar más productos.");
                    }
                    break;

                case 2:
                    System.out.print("Ingresa el nombre del producto para actualizar la cantidad: ");
                    String nombreBuscar = scanner.next();
                    boolean encontrado = false;

                    for (int i = 0; i < numProductos; i++) {
                        if (productos[i].equalsIgnoreCase(nombreBuscar)) {
                            System.out.print("Ingresa la nueva cantidad: ");
                            int nuevaCantidad = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer de entrada
                            cantidades[i] = nuevaCantidad;
                            encontrado = true;
                            System.out.println("Cantidad actualizada correctamente.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nInventario de Productos:");
                    for (int i = 0; i < numProductos; i++) {
                        System.out.println("Producto: " + productos[i] + " | Cantidad en stock: " + cantidades[i]);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema de inventario.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        }
    }
}
