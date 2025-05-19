package padroesComportamentais.chainOfResponsibility;

public class TipoDocumentoMatricula implements TipoDocumento {
    private static TipoDocumentoMatricula tipoDocumentoMatricula = new TipoDocumentoMatricula();

    private TipoDocumentoMatricula() {};

    public static TipoDocumentoMatricula getTipoDocumentoMatricula() {
        return tipoDocumentoMatricula;
    }
}
