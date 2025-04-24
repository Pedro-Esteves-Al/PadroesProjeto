package padroesCriacao.abstractFactory;

public class FabricaCPF implements FabricaAbstrata {
    @Override
    public Intimacao createIntimacao() {
        return new IntimacaoCPF();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoCPF();
    }
}
