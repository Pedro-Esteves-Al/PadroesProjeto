package padroesComportamentais.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    private Funcionario superior;
    private ArrayList<TipoDocumento> documentoList = new ArrayList();
    public Funcionario getSuperior() {
        return superior;
    }

    public ArrayList<TipoDocumento> getDocumentos() {
        return documentoList;
    }
    public void setDocumentoList(ArrayList<TipoDocumento> documentoList) {
        this.documentoList = documentoList;
    }

    public void assinarDocumento() {

    }
}
