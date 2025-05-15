package padroesComportamentais.chainOfResponsibility;

public class TipoDocumentoHistorico implements TipoDocumento {
    private String tipo = "Historico";
    private TipoDocumentoHistorico() {}

    private static TipoDocumentoHistorico instance = new TipoDocumentoHistorico();
    public static TipoDocumentoHistorico getInstance() {
        return instance;
    }


    public String getTipo() {
        return this.tipo;
    }
}
