import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class project {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        String[] nombresProyectos = new String[5];
        double[] calificaciones = new double[5];

        // Ingresar los nombres de los proyectos y sus calificaciones
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el nombre del proyecto " + (i + 1) + ": ");
            nombresProyectos[i] = scanner.nextLine();

            System.out.print("Ingresa la calificación del proyecto " + nombresProyectos[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
        }

        // Crear un arreglo de objetos para combinar nombre y calificación
        Proyecto[] proyectos = new Proyecto[5];
        for (int i = 0; i < 5; i++) {
            proyectos[i] = new Proyecto(nombresProyectos[i], calificaciones[i]);
        }

        // Ordenar los proyectos por calificación de mayor a menor
        Arrays.sort(proyectos, Comparator.comparingDouble(Proyecto::getCalificacion).reversed());

        // Mostrar los proyectos ordenados por calificación
        System.out.println("\nProyectos ordenados por calificación:");
        for (Proyecto proyecto : proyectos) {
            System.out.printf("Proyecto: %s - Calificación: %.2f%n", proyecto.getNombre(), proyecto.getCalificacion());
        }

        scanner.close();
    }
}

class Proyecto {
    private String nombre;
    private double calificacion;

    public Proyecto(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }
}