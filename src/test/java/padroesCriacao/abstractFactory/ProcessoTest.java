package padroesCriacao.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessoTest {
    @Test
    void deveRedigirProcuracaoTrabalhista() {
        FabricaAbstrata fabrica = FabricaCNPJ.getInstancia();
        Processo processo = new Processo(fabrica);
        assertEquals("Procuração CNPJ", processo.redigirProcuracao());
    }

    @Test
    void deveRedigirProcuracaoCivel() {
        FabricaAbstrata fabrica = FabricaCPF.getInstancia();
        Processo processo = new Processo(fabrica);
        assertEquals("Procuração CPF", processo.redigirProcuracao());
    }

    @Test
    void deveRedigirIntimacaoTrabalhista() {
        FabricaAbstrata fabrica = FabricaCNPJ.getInstancia();
        Processo processo = new Processo(fabrica);
        assertEquals("Intimação CNPJ", processo.redigirIntimacao());
    }

    @Test
    void deveRedigirIntimacaoCivel() {
        FabricaAbstrata fabrica = FabricaCPF.getInstancia();
        Processo processo = new Processo(fabrica);
        assertEquals("Intimação CPF", processo.redigirIntimacao());
    }
}