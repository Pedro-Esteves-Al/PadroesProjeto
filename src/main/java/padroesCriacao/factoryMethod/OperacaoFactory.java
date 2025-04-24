package padroesCriacao.factoryMethod;

public class OperacaoFactory {

    private OperacaoFactory() {}
    private static OperacaoFactory instance = new OperacaoFactory();

    public static IOperacao obterOperacao(String operacao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroesCriacao.factoryMethod.Operacao" + operacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Operação inexistente");
        }
        if (!(objeto instanceof IOperacao)) {
            throw new IllegalArgumentException("Operação inválida");
        }
        return (IOperacao) objeto;
    }
}
