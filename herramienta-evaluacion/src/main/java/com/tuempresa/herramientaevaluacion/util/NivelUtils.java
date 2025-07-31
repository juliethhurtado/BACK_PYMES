package com.tuempresa.herramientaevaluacion.util;

import java.util.List;

public class NivelUtils {

    // Calcula el nivel de madurez con base en las 22 respuestas (valores entre 1 y 5)
    public static int calcularNivel(List<Integer> respuestas) {
        if (respuestas == null || respuestas.size() != 22) {
            throw new IllegalArgumentException("Se requieren exactamente 22 respuestas para calcular el nivel.");
        }

        int suma = respuestas.stream().mapToInt(i -> i).sum();
        return Math.round(suma / 22.0f);
    }

    // Devuelve el mensaje asociado a cada nivel
    public static String obtenerMensajeNivel(int nivel) {
        return switch (nivel) {
            case 1 -> "Tu empresa está empezando. ¡Ánimo!";
            case 2 -> "Vas en camino, puedes seguir mejorando.";
            case 3 -> "Buen trabajo. Hay aspectos por fortalecer.";
            case 4 -> "Excelente avance. Solo falta poco.";
            case 5 -> "¡Felicidades! Son expertos en tecnología.";
            default -> "Sin evaluación disponible.";
        };
    }
}

