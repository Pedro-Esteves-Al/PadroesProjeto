package padroesCriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformacoesSistemaTest {

    @Test
    void getNomeBiblioteca() {
        InformacoesSistema.getInstance().setNomeBiblioteca("Almirante Vaz Camillo");
        assertEquals("Almirante Vaz Camillo",InformacoesSistema.getInstance().getNomeBiblioteca());
    }

    @Test
    void getDiasParaEntrega() {
        InformacoesSistema.getInstance().setDiasParaEntrega(10);
        assertEquals(10,InformacoesSistema.getInstance().getDiasParaEntrega());
    }
    @Test
    void getValorMultaDiaria() {
        InformacoesSistema.getInstance().setValorMultaDiaria(2.50);
        assertEquals(2.50,InformacoesSistema.getInstance().getValorMultaDiaria());
    }
}