package padroesEstruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarIngredientesDoHamburguer() {
        Ingrediente ingrediente = new Hamburguer("Pão, carne");

        assertEquals("Pão, carne", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoHamburguerComAdicionalQueijo() {
        Ingrediente ingrediente = new AdicionalQueijo(new Hamburguer("Pão, carne"));

        assertEquals("Pão, carne, queijo", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoHamburguerComAdicionalBacon() {
        Ingrediente ingrediente = new AdicionalBacon(new Hamburguer("Pão, carne"));

        assertEquals("Pão, carne, bacon", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoHamburguerComAdicionalMolho() {
        Ingrediente ingrediente = new AdicionalMolho(new Hamburguer("Pão, carne"));

        assertEquals("Pão, carne, kectchup", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoHamburguerComAdicionalMolhoEQueijo() {
        Ingrediente ingrediente = new AdicionalQueijo(new AdicionalMolho(new Hamburguer("Pão, carne")));

        assertEquals("Pão, carne, kectchup, queijo", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoCompletasso() {
        Ingrediente ingrediente = new AdicionalBacon(new AdicionalQueijo(new AdicionalMolho(new Hamburguer("Pão, carne"))));

        assertEquals("Pão, carne, kectchup, queijo, bacon", ingrediente.getIngredientes());
    }

}