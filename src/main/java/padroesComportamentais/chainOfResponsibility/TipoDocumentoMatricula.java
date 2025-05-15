package padroesComportamentais.chainOfResponsibility;

public class TipoDocumentoMatricula implements TipoDocumento {
    private String tipo = "Matricula";

    private TipoDocumentoMatricula() {}

    private static TipoDocumentoMatricula instance = new TipoDocumentoMatricula();
    public static TipoDocumentoMatricula getInstance() {
        return instance;
    }
    //talvez não precise do this
    public String getTipo() {
        return this.tipo;
    }
}
