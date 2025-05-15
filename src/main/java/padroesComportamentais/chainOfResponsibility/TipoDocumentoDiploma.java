package padroesComportamentais.chainOfResponsibility;

public class TipoDocumentoDiploma implements TipoDocumento {
    private String tipo = "Diploma";

    private TipoDocumentoDiploma() {}

    private static TipoDocumentoDiploma instance = new TipoDocumentoDiploma();
    public static TipoDocumentoDiploma getInstance() {
        return instance;
    }


    public String getTipo() {
        return this.tipo;
    }
}
