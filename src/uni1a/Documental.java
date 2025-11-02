/**
 * Class Documental
 */
package uni1a;

public class Documental extends ContenidoAudiovisual {
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
    }

    public void asignarInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());

        if (investigador != null) {
            System.out.println("Investigador: " + investigador.getNombre() +
                    " | Especialidad: " + investigador.getEspecialidad());
        } else {
            System.out.println("No se ha asignado un investigador.");
        }
        System.out.println();
    }
}
