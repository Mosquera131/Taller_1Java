import java.util.Scanner;

public class Bills {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);


        double facturaElectricidad, facturaAgua, facturaInternet;

        // Ingresar los montos de las tres facturas
        System.out.print("Ingresa el monto de la factura de electricidad: ");
        facturaElectricidad = scanner.nextDouble();

        System.out.print("Ingresa el monto de la factura de agua: ");
        facturaAgua = scanner.nextDouble();

        System.out.print("Ingresa el monto de la factura de internet: ");
        facturaInternet = scanner.nextDouble();

        // Calcular el total a pagar
        double totalAPagar = facturaElectricidad + facturaAgua + facturaInternet;
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);

        // Ciclo para permitir el pago de cada factura individualmente
        while (totalAPagar > 0) {
            System.out.println("\nOpciones de pago:");
            System.out.println("1. Pagar factura de electricidad");
            System.out.println("2. Pagar factura de agua");
            System.out.println("3. Pagar factura de internet");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (facturaElectricidad > 0) {
                        totalAPagar -= facturaElectricidad;
                        System.out.printf("Factura de electricidad pagada: $%.2f%n", facturaElectricidad);
                        facturaElectricidad = 0; // Marcar factura como pagada
                    } else {
                        System.out.println("La factura de electricidad ya está pagada.");
                    }
                    break;

                case 2:
                    if (facturaAgua > 0) {
                        totalAPagar -= facturaAgua;
                        System.out.printf("Factura de agua pagada: $%.2f%n", facturaAgua);
                        facturaAgua = 0; // Marcar factura como pagada
                    } else {
                        System.out.println("La factura de agua ya está pagada.");
                    }
                    break;

                case 3:
                    if (facturaInternet > 0) {
                        totalAPagar -= facturaInternet;
                        System.out.printf("Factura de internet pagada: $%.2f%n", facturaInternet);
                        facturaInternet = 0; // Marcar factura como pagada
                    } else {
                        System.out.println("La factura de internet ya está pagada.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema de pago.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }

            // Mostrar el total pendiente después de cada pago
            System.out.printf("Total pendiente: $%.2f%n", totalAPagar);

            // Salir si todas las facturas están pagadas
            if (totalAPagar <= 0) {
                System.out.println("Todas las facturas han sido pagadas.");
                break;
            }
        }

        scanner.close();
    }
}
