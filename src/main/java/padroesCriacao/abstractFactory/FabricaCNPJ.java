package padroesCriacao.abstractFactory;

public class FabricaCNPJ implements FabricaAbstrata {
    private static FabricaCNPJ instancia;

    private FabricaCNPJ() {
    }

    public static FabricaCNPJ getInstancia() {
        if (instancia == null) {
            instancia = new FabricaCNPJ();
        }
        return instancia;
    }

    @Override
    public Intimacao createIntimacao() {
        return new IntimacaoCNPJ();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoCNPJ();
    }
}
