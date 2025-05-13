package padroesComportamentais.state;

public class PacienteEstadoIml extends PacienteEstado {
    private PacienteEstadoIml() {};
    private static PacienteEstadoIml instance = new PacienteEstadoIml();
    public static PacienteEstadoIml getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Morto";
    }
}
