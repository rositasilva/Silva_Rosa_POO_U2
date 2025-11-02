package uni1a;

public class Temporada {
    private String nombre;
    private int numeroEpisodios;

    public Temporada(String nombre, int numeroEpisodios) {
        this.nombre = nombre;
        this.numeroEpisodios = numeroEpisodios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }
}
