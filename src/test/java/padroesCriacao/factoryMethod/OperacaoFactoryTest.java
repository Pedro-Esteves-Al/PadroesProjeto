package padroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoFactoryTest {
    @Test
    void deveTestarOperacaoInexistente() {
        try {
            IOperacao operacao = OperacaoFactory.obterOperacao("Destruicao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Operação inexistente", e.getMessage());
        }
    }

    @Test
    void deveTestarOperacaoInvalida() {
        try {
            IOperacao operacao = OperacaoFactory.obterOperacao("AplicarMulta");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Operação inválida", e.getMessage());
        }
    }

}