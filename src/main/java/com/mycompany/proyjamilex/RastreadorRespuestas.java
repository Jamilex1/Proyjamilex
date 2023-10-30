import java.util.Random;

public class RastreadorRespuestas {
    int correctas = 0;
    int incorrectas = 0;

    public void respuestaCorrecta() {
        correctas++;
    }

    public void respuestaIncorrecta() {
        incorrectas++;
    }

    public void generarMensajePositivo() {
        String[] mensajes = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!"};
        System.out.println(mensajes[new Random().nextInt(mensajes.length)]);
    }

    public void generarMensajeNegativo() {
        String[] mensajes = {"No. Por favor intenta de nuevo.", "Incorrecto. Intenta una vez más.", "¡No te rindas!", "No. Sigue intentando."};
        System.out.println(mensajes[new Random().nextInt(mensajes.length)]);
    }
}
