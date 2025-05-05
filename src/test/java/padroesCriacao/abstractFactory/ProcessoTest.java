package padroesCriacao.abstractFactory;

import org.junit.jupiter.api.Test;
import padroesEstruturais.bridge.Convocacao;
import padroesEstruturais.bridge.ConvocacaoPresencial;
import padroesEstruturais.bridge.ConvocacaoRemota;

import static org.junit.jupiter.api.Assertions.*;

class ProcessoTest {

    //Testes de fabrica abstrata tiveram que ter o convocacao adicionado
    @Test
    void deveRedigirProcuracaoTrabalhista() {
        FabricaAbstrata fabrica = FabricaCNPJ.getInstancia();
        Convocacao convocacao = new ConvocacaoPresencial();
        Processo processo = new Processo(fabrica, convocacao);
        assertEquals("Procuração CNPJ", processo.redigirProcuracao());
    }

    @Test
    void deveRedigirProcuracaoCivel() {
        FabricaAbstrata fabrica = FabricaCPF.getInstancia();
        Convocacao convocacao = new ConvocacaoPresencial();
        Processo processo = new Processo(fabrica, convocacao);
        assertEquals("Procuração CPF", processo.redigirProcuracao());
    }

    @Test
    void deveRedigirIntimacaoTrabalhista() {
        FabricaAbstrata fabrica = FabricaCNPJ.getInstancia();
        Convocacao convocacao = new ConvocacaoPresencial();
        Processo processo = new Processo(fabrica, convocacao);
        assertEquals("Intimação CNPJ", processo.redigirIntimacao());
    }

    @Test
    void deveRedigirIntimacaoCivel() {
        FabricaAbstrata fabrica = FabricaCPF.getInstancia();
        Convocacao convocacao = new ConvocacaoPresencial();
        Processo processo = new Processo(fabrica, convocacao);
        assertEquals("Intimação CPF", processo.redigirIntimacao());
    }

    //Testes de bridge
    @Test
    void deveEnviarConvocacaoPresencial() {
        FabricaAbstrata fabrica = FabricaCPF.getInstancia();
        Convocacao convocacao = new ConvocacaoPresencial();
        Processo processo = new Processo(fabrica, convocacao);
        assertEquals("Convocacao presencial", processo.enviarConvocacao());
    }

    @Test
    void deveEnviarConvocacaoRemota() {
        FabricaAbstrata fabrica = FabricaCPF.getInstancia();
        Convocacao convocacao = new ConvocacaoRemota();
        Processo processo = new Processo(fabrica, convocacao);
        assertEquals("Convocacao por videoconferencia", processo.enviarConvocacao());
    }
}