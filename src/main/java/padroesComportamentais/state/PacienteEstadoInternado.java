package padroesComportamentais.state;

public class PacienteEstadoInternado extends PacienteEstado {
    private PacienteEstadoInternado() {
    };
    private static PacienteEstadoInternado instance = new PacienteEstadoInternado();

    public static PacienteEstadoInternado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Internado";
    }

    public boolean enviarUti(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return true;
    }

    public boolean enviarIml(Paciente paciente) {
        paciente.setEstado(PacienteEstadoIml.getInstance());
        return true;
    }
    public boolean darAlta(Paciente paciente) {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        return true;
    }
}
