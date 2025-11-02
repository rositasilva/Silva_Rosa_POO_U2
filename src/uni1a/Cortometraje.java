package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private boolean premiado;
    private Actor actorPrincipal;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, boolean premiado) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.premiado = premiado;
    }

    public void asignarActorPrincipal(Actor actor) {
        this.actorPrincipal = actor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("¿Premiado?: " + (premiado ? "Sí" : "No"));
        if (actorPrincipal != null) {
            System.out.println("Actor principal: " + actorPrincipal.getNombre());
        }
        System.out.println();
    }
}
