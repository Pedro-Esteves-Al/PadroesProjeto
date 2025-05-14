package padroesComportamentais.state;

public class PacienteEstadoUti extends PacienteEstado{
    private PacienteEstadoUti() {};
    private static PacienteEstadoUti instance = new PacienteEstadoUti();
    public static PacienteEstadoUti getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Encaminhado pra UTI";
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
