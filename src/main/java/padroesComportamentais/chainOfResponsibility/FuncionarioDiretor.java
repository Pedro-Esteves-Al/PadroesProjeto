package padroesComportamentais.chainOfResponsibility;

public class FuncionarioDiretor extends Funcionario {
    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
