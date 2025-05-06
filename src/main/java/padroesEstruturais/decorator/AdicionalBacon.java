package padroesEstruturais.decorator;

public class AdicionalBacon extends HamburguerDecorator {
    public AdicionalBacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public String getAdicional() {
        return "Bacon";
    }
}
