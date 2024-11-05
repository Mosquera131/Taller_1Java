import java.util.Scanner;

public class votacion {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);

        // Arreglo con los nombres de los candidatos
        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        int[] votos = new int[candidatos.length]; // Arreglo para contar los votos de cada candidato

        System.out.println("Sistema de Votación Electrónica");
        System.out.println("Opciones de votación:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + ". " + candidatos[i]);
        }

        // Permitir a 10 usuarios votar
        for (int i = 0; i < 10; i++) {
            System.out.print("\nVotante " + (i + 1) + ", elige el número de tu candidato: ");
            int voto = scanner.nextInt();

            // Validar el voto
            if (voto >= 1 && voto <= candidatos.length) {
                votos[voto - 1]++; // Sumar el voto al candidato correspondiente
                System.out.println("Voto registrado.");
            } else {
                System.out.println("Opción inválida. Voto no registrado.");
                i--; // Reintentar el voto para el mismo votante
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados de la votación:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }

        // Determinar el ganador
        int maxVotos = votos[0];
        int indiceGanador = 0;
        boolean empate = false;

        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceGanador = i;
                empate = false; // Reiniciar la variable de empate
            } else if (votos[i] == maxVotos) {
                empate = true; // Hay un empate
            }
        }

        // Mostrar el resultado final
        if (empate) {
            System.out.println("La votación terminó en empate.");
        } else {
            System.out.println("El ganador es: " + candidatos[indiceGanador] + " con " + maxVotos + " votos.");
        }

        scanner.close();
    }
}
