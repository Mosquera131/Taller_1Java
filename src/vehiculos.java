import java.util.Scanner;
import java.util.ArrayList;
public class vehiculos {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nSistema de Gestión de Vehículos");
            System.out.println("1. Registrar nuevo vehículo");
            System.out.println("2. Actualizar estado de vehículo");
            System.out.println("3. Mostrar vehículos disponibles");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarVehiculo(vehiculos, scanner);
                    break;
                case 2:
                    actualizarEstadoVehiculo(vehiculos, scanner);
                    break;
                case 3:
                    mostrarVehiculosDisponibles(vehiculos);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para registrar un nuevo vehículo
    public static void registrarVehiculo(ArrayList<Vehiculo> vehiculos, Scanner scanner) {
        System.out.print("Ingresa la matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingresa el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingresa el estado del vehículo (disponible/ocupado): ");
        String estado = scanner.nextLine().toLowerCase();

        if (!estado.equals("disponible") && !estado.equals("ocupado")) {
            System.out.println("Estado no válido. El estado debe ser 'disponible' u 'ocupado'.");
            return;
        }

        vehiculos.add(new Vehiculo(matricula, modelo, estado));
        System.out.println("Vehículo registrado exitosamente.");
    }

    // Método para actualizar el estado de un vehículo
    public static void actualizarEstadoVehiculo(ArrayList<Vehiculo> vehiculos, Scanner scanner) {
        System.out.print("Ingresa la matrícula del vehículo a actualizar: ");
        String matricula = scanner.nextLine();
        boolean encontrado = false;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.print("Ingresa el nuevo estado del vehículo (disponible/ocupado): ");
                String nuevoEstado = scanner.nextLine().toLowerCase();

                if (!nuevoEstado.equals("disponible") && !nuevoEstado.equals("ocupado")) {
                    System.out.println("Estado no válido. El estado debe ser 'disponible' u 'ocupado'.");
                    return;
                }

                vehiculo.setEstado(nuevoEstado);
                System.out.println("Estado del vehículo actualizado.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
    }
}
    // Método para mostrar los vehículos disponibles
    public static void mostrarVehiculosDisponibles(ArrayList<Vehiculo> vehiculos) {
        System.out.println("\nVehículos disponibles:");
        boolean hayDisponibles = false;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getEstado().equals("disponible")) {
                System.out.printf("Matrícula: %s, Modelo: %s%n", vehiculo.getMatricula(), vehiculo.getModelo());
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay vehículos disponibles.");
        }
    }
}

// Clase para representar un vehículo
class Vehiculo {
    private String matricula;
    private String modelo;
    private String estado;

    public Vehiculo(String matricula, String modelo, String estado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
