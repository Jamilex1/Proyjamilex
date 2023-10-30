import java.util.Random;

public class GeneradorProblemas {
    Random random = new Random();
    int nivel;
    int tipo;

    public GeneradorProblemas(int nivel, int tipo) {
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public int[] generarOperandos() {
        int limite = (int) Math.pow(10, nivel);
        return new int[]{random.nextInt(limite), random.nextInt(limite)};
    }
}
