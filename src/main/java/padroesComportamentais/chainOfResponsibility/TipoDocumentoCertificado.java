package padroesComportamentais.chainOfResponsibility;

public class TipoDocumentoCertificado implements TipoDocumento {
    private String tipo = "Certificado";
    private TipoDocumentoCertificado() {}

    private static TipoDocumentoCertificado instance = new TipoDocumentoCertificado();
    public static TipoDocumentoCertificado getInstance() {
        return instance;
    }


    public String getTipo() {
        return this.tipo;
    }
}
