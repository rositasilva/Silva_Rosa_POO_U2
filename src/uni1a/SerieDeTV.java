package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada t) {
        listaTemporadas.add(t);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Cantidad de temporadas: " + temporadas);

        if (listaTemporadas.isEmpty()) {
            System.out.println("No hay temporadas registradas.");
        } else {
            for (Temporada t : listaTemporadas) {
                System.out.println(" - " + t.getNombre() + " (" + t.getNumeroEpisodios() + " episodios)");
            }
        }
        System.out.println();
    }
}
