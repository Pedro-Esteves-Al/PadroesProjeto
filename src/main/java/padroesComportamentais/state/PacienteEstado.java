package padroesComportamentais.state;

public abstract class PacienteEstado {
    public abstract String getEstado();

    public boolean darAlta(Paciente paciente) {
        return false;
    }
    public boolean internar(Paciente paciente) {
        return false;
    }
    public boolean enviarIml(Paciente paciente) { return false; }
    public boolean enviarUti(Paciente paciente) {
        return false;
    }
}
