package padroesEstruturais.decorator;

public class Hamburguer implements Ingrediente {
    private String ingredientes;

    public Hamburguer() {

    }

    public Hamburguer(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }
}
