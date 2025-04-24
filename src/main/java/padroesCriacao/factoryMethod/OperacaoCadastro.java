package padroesCriacao.factoryMethod;


public class OperacaoCadastro implements IOperacao {
    public String executar() {
        return "Cadastro conclúido";
    }

    public String cancelar() {
        return "Cadastro cancelado";
    }
}
