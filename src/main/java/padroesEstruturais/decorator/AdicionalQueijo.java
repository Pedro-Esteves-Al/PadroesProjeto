package padroesEstruturais.decorator;

public class AdicionalQueijo extends HamburguerDecorator {
    public AdicionalQueijo(Ingrediente ingrediente) {
        super(ingrediente);
    }
    public String getAdicional() {
        return "Queijo";
    }
}
