package poo;
import uni1a.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA AUDIOVISUAL FUNCIONAL =====\n");

        // --- CREACIÓN DE OBJETOS ---

        // PELÍCULA
        Pelicula pelicula1 = new Pelicula("Love Untagled", 158, "Romance", "Bombaram Film");
        pelicula1.agregarActor(new Actor("Shin Eun-soo", 23));
        pelicula1.agregarActor(new Actor("Gong Myung", 31));

        // SERIE
        SerieDeTV serie1 = new SerieDeTV("The Vampire Diaries", 49, "Drama", 8);
        for (int i = 1; i <= 8; i++) {
            serie1.agregarTemporada(new Temporada("Temporada " + i, 10 + i));
        }

        // DOCUMENTAL
        Investigador investigador1 = new Investigador("Neil deGrasse Tyson", "Astronomía");
        Documental doc1 = new Documental("Cosmos", 45, "Science");
        doc1.asignarInvestigador(investigador1);

        // CORTOMETRAJE
        Actor actorCorto = new Actor("Timothée Chalamet", 28);
        Cortometraje corto1 = new Cortometraje("El Viaje", 20, "Drama", "Lucía Martínez", true);
        corto1.asignarActorPrincipal(actorCorto);

        // VIDEO YOUTUBE
        Investigador invYT = new Investigador("Dr. Javier Pérez", "Educación Científica");
        VideoYoutube video1 = new VideoYoutube("Explorando el Universo", 10, "Educativo", "ScienceUp", 50000, 2300);
        video1.asignarColaborador(invYT);

        // --- PRUEBA DE MANIPULACIÓN DE OBJETOS ---
        System.out.println("\n¿Deseas aumentar las vistas del video? (s/n)");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            video1.aumentarVistas();
            System.out.println("✅ ¡Se aumentó una vista al video!");
        }

        System.out.println("\n¿Deseas agregar otro actor a la película? (s/n)");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Nombre del actor: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            pelicula1.agregarActor(new Actor(nombre, edad));
            System.out.println("✅ Actor agregado con éxito.");
        }

        // --- ARREGLO POLIMÓRFICO ---
        ContenidoAudiovisual[] contenidos = {pelicula1, serie1, doc1, corto1, video1};

        // --- MOSTRAR TODOS LOS DETALLES ---
        System.out.println("\n===== DETALLES COMPLETOS DEL SISTEMA =====\n");
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }

        System.out.println("===== FIN DE LA EJECUCIÓN =====");
        sc.close();
    }
}
