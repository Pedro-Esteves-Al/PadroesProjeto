package padroesEstruturais.decorator;

public abstract class HamburguerDecorator implements Ingrediente {
    private Ingrediente ingrediente;

    public HamburguerDecorator(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    public void setIngrediente (Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    public abstract String getAdicional();

    public String getIngredientes() {
        return this.ingrediente.getIngredientes() +", "+ this.getAdicional();
    }
}
