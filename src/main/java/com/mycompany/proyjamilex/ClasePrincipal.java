import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el nivel de dificultad: ");
        int nivel = scanner.nextInt();
        System.out.println("Elige el tipo de problema (1: Suma, 2: Resta): ");
        int tipo = scanner.nextInt();

        GeneradorProblemas generador = new GeneradorProblemas(nivel, tipo);
        RastreadorRespuestas rastreador = new RastreadorRespuestas();



        scanner.close();
    }
}

