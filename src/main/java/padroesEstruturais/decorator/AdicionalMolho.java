package padroesEstruturais.decorator;

public class AdicionalMolho extends HamburguerDecorator {
    public AdicionalMolho(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public String getAdicional() {
        return "kectchup";
    }

}
