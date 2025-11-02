package uni1a;

public class VideoYoutube extends ContenidoAudiovisual {
    private String creador;
    private int vistas;
    private int likes;
    private Investigador colaborador;

    public VideoYoutube(String titulo, int duracionEnMinutos, String genero, String creador, int vistas, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
        this.vistas = vistas;
        this.likes = likes;
    }

    public void asignarColaborador(Investigador investigador) {
        this.colaborador = investigador;
    }

    // 👇 Este método es el que causaba el error porque no estaba definido
    public void aumentarVistas() {
        vistas++;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Vistas: " + vistas);
        System.out.println("Likes: " + likes);
        if (colaborador != null) {
            System.out.println("Colaborador: " + colaborador.getNombre() + " (" + colaborador.getEspecialidad() + ")");
        }
        System.out.println();
    }

    // Getters opcionales
    public String getCreador() { return creador; }
    public int getVistas() { return vistas; }
    public int getLikes() { return likes; }
}
