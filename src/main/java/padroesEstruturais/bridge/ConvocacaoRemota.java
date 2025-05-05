package padroesEstruturais.bridge;

public class ConvocacaoRemota implements Convocacao{
    @Override
    public String convocar() {
        return "Convocacao por videoconferencia";
    }
}
