import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Ejemplo de empleados en el sistema
        empleados.add(new Empleado("Juan Pérez", "Gerente", 50000));
        empleados.add(new Empleado("María López", "Contador", 40000));
        empleados.add(new Empleado("Carlos Gómez", "Desarrollador", 30000));

        System.out.println("Sistema de Gestión de Empleados");

        // Menú de opciones
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Buscar empleado por puesto");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea nueva

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Puesto del empleado: ");
                    String puesto = scanner.nextLine();
                    System.out.print("Salario del empleado: ");
                    double salario = scanner.nextDouble();
                    empleados.add(new Empleado(nombre, puesto, salario));
                    System.out.println("Empleado añadido correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del empleado a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontradoNombre = false;
                    for (Empleado empleado : empleados) {
                        if (empleado.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            empleado.mostrarDetalles();
                            encontradoNombre = true;
                        }
                    }
                    if (!encontradoNombre) {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el puesto de los empleados a buscar: ");
                    String puestoBuscar = scanner.nextLine();
                    boolean encontradoPuesto = false;
                    for (Empleado empleado : empleados) {
                        if (empleado.getPuesto().equalsIgnoreCase(puestoBuscar)) {
                            empleado.mostrarDetalles();
                            encontradoPuesto = true;
                        }
                    }
                    if (!encontradoPuesto) {
                        System.out.println("No se encontraron empleados con ese puesto.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
