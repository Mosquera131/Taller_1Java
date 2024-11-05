import java.util.Scanner;

public class GastosMensuales {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        double[] gastosMensuales = new double[12];
        double gastoTotal = 0;

        // Ingresar los gastos para cada uno de los 12 meses
        for (int mes = 0; mes < 12; mes++) {
            System.out.print("Ingresa el gasto del mes " + (mes + 1) + ": ");
            gastosMensuales[mes] = scanner.nextDouble();
            gastoTotal += gastosMensuales[mes];
        }

        // Calcular el promedio mensual
        double promedioMensual = gastoTotal / gastosMensuales.length;

        // Mostrar los resultados
        System.out.println("\nResumen del Año:");
        System.out.printf("Gasto total del año: $%.2f%n", gastoTotal);
        System.out.printf("Promedio mensual de gastos: $%.2f%n", promedioMensual);

        scanner.close();
    }
}
