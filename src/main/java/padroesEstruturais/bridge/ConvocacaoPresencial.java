package padroesEstruturais.bridge;

public class ConvocacaoPresencial implements Convocacao {
    @Override
    public String convocar() {
        return "Convocacao presencial";
    }
}
