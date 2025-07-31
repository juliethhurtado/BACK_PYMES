package com.tuempresa.herramientaevaluacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarCorreoResultado(String destinatario, String nombreEmpresa, int nivel) {
        SimpleMailMessage correo = new SimpleMailMessage();
        correo.setTo(destinatario);
        correo.setSubject("Resultado Evaluación de Madurez Tecnológica");

        String cuerpo = "Gracias por participar " + nombreEmpresa + " en esta encuesta. Tus resultados son los siguientes:\n\n"
                + obtenerMensajeNivel(nivel) + "\n\n"
                + "Gracias por utilizar la herramienta SADE.\n"
                + "Este correo se genera automáticamente, por favor no responder.";

        correo.setText(cuerpo);
        mailSender.send(correo);
    }

    public String obtenerMensajeNivel(int nivel) {
        return switch (nivel) {
            case 1 -> "Nivel 1 – Inicial (0% – 20%)\n\n"
                    + "Estás en el Nivel 1 - Inicial.\n"
                    + "Tu empresa se encuentra en una etapa temprana en la adopción de tecnologías de la Industria 4.0. "
                    + "Actualmente, presenta un bajo nivel de digitalización y ausencia de estrategias claras para la transformación digital.\n"
                    + "Para avanzar al Nivel 2, te recomendamos iniciar procesos de sensibilización, fortalecer la visión estratégica digital "
                    + "y explorar herramientas tecnológicas básicas.";
            case 2 -> "Nivel 2 – Exploratorio (21% – 40%)\n\n"
                    + "Estás en el Nivel 2 - Exploratorio.\n"
                    + "Tu empresa ha empezado a explorar el uso de tecnologías digitales, pero aún se encuentra en una etapa incipiente. "
                    + "Hay esfuerzos aislados y poco sistemáticos para integrar tecnologías de Industria 4.0.\n"
                    + "Para avanzar al Nivel 3, es clave consolidar una estructura organizacional orientada a la transformación digital, "
                    + "capacitar al talento humano y avanzar en el uso de tecnologías más avanzadas.";
            case 3 -> "Nivel 3 – En transición (41% – 60%)\n\n"
                    + "Estás en el Nivel 3 - En transición.\n"
                    + "Tu empresa ha avanzado en la adopción de tecnologías, mostrando procesos organizativos más estructurados y conciencia del valor "
                    + "de la transformación digital. Sin embargo, aún puede mejorar en áreas como automatización, integración de datos y fortalecimiento de capacidades del personal.\n"
                    + "Para alcanzar el Nivel 4, te sugerimos continuar con la formación del talento, integrar soluciones de Big Data y consolidar estrategias de liderazgo digital.";
            case 4 -> "Nivel 4 – Integrado (61% – 80%)\n\n"
                    + "Estás en el Nivel 4 - Integrado.\n"
                    + "Tu empresa ha logrado implementar de manera sistemática diversas tecnologías y procesos de Industria 4.0. "
                    + "Existe una estrategia consolidada, cultura de innovación y buena coordinación interna.\n"
                    + "Para llegar al Nivel 5, se recomienda profundizar en el uso de tecnologías emergentes, como inteligencia artificial, "
                    + "y generar un ecosistema de innovación que te permita liderar procesos de transformación dentro y fuera de tu sector.";
            case 5 -> "Nivel 5 – Avanzado / Transformador (81% – 100%)\n\n"
                    + "Estás en el Nivel 5 - Avanzado / Transformador.\n"
                    + "Felicidades tu empresa es referente en adopción tecnológica y transformación digital. "
                    + "Tiene capacidades sólidas en liderazgo, análisis de datos, automatización y gestión del cambio. "
                    + "Además, actúa como agente impulsor en su entorno productivo.\n"
                    + "Te invitamos a seguir promoviendo innovación abierta, alianzas estratégicas y mentoría a otras empresas para contribuir al desarrollo tecnológico del país.";
            default -> "Sin evaluación disponible.";
        };
    }
}
