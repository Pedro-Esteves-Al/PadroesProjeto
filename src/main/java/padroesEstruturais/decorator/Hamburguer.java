package padroesEstruturais.decorator;

public class Hamburguer implements Ingrediente {
    public String ingredientes;

    public Hamburguer() {

    }

    public Hamburguer(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }
}
