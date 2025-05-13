package padroesComportamentais.state;

public class Paciente {
    private PacienteEstado estado;

    public Paciente() {
        this.estado = PacienteEstadoInternado.getInstance();
    }

    public void setEstado(PacienteEstado estado) {
        this.estado = estado;
    }
    public PacienteEstado getEstado() {
        return estado;
    }

    public boolean internar() {
        return estado.internar(this);
    }

    public boolean darAlta() {
        return estado.darAlta(this);
    }

    public boolean enviarIml() {
        return estado.enviarIml(this);
    }

    public boolean enviarUti() {
        return estado.enviarUti(this);
    }
}
