package padroesCriacao.abstractFactory;

import padroesEstruturais.bridge.Convocacao;

public class Processo {
    private Intimacao intimacao;
    private Procuracao procuracao;
    private Convocacao convocacao;

    public Processo (FabricaAbstrata fabrica, Convocacao convocacao) {
        this.intimacao = fabrica.createIntimacao();
        this.procuracao = fabrica.createProcuracao();
        this.convocacao = convocacao;
    }

    //Fabrica abstrata
    public String redigirProcuracao() {
        return this.procuracao.redigir();
    }

    public String redigirIntimacao() {
        return this.intimacao.redigir();
    }

    //bridge
    public String enviarConvocacao() {return this.convocacao.convocar();}
}
