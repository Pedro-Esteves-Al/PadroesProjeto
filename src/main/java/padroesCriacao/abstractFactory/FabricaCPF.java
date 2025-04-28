package padroesCriacao.abstractFactory;

public class FabricaCPF implements FabricaAbstrata {
    private static FabricaCPF instancia;

    private FabricaCPF() {
    }

    public static FabricaCPF getInstancia() {
        if (instancia == null) {
            instancia = new FabricaCPF();
        }
        return instancia;
    }

    @Override
    public Intimacao createIntimacao() {
        return new IntimacaoCPF();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoCPF();
    }
}
