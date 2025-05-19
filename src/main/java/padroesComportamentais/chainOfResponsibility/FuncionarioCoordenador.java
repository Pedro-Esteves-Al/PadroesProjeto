package padroesComportamentais.chainOfResponsibility;

import java.util.ArrayList;

public class FuncionarioCoordenador extends Funcionario {

    public FuncionarioCoordenador(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoMatricula.getTipoDocumentoMatricula());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Coordenador";
    }
}
