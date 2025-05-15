package padroesComportamentais.chainOfResponsibility;

public class TipoDocumentoBoleto implements TipoDocumento {
    private String tipo = "Boleto";
    private TipoDocumentoBoleto() {}
    private static TipoDocumentoBoleto instance = new TipoDocumentoBoleto();
    public static TipoDocumentoBoleto getInstance() {
        return instance;
    }

    public String getTipo() {
        return this.tipo;
    }
}
