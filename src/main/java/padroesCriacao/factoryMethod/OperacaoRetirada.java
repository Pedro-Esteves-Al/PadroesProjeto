package padroesCriacao.factoryMethod;

public class OperacaoRetirada implements IOperacao {
    public String executar() {
        return "Retirada conclúida";
    }

    public String cancelar() {
        return "Retirada cancelada";
    }
}
