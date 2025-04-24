package padroesCriacao.abstractFactory;

public class Processo {
    private Intimacao intimacao;
    private Procuracao procuracao;

    public Processo (FabricaAbstrata fabrica) {
        this.intimacao = fabrica.createIntimacao();
        this.procuracao = fabrica.createProcuracao();
    }

    public String redigirProcuracao() {
        return this.procuracao.redigir();
    }

    public String redigirIntimacao() {
        return this.intimacao.redigir();
    }
}
