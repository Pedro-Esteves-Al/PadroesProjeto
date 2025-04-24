package padroesCriacao.abstractFactory;

public class FabricaCNPJ implements FabricaAbstrata {
    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoCNPJ();
    }
    @Override
    public Intimacao createIntimacao() {
        return new IntimacaoCNPJ();
    }
}
