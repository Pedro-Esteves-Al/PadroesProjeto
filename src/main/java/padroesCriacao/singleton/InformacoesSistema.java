package padroesCriacao.singleton;

public class InformacoesSistema {
    private InformacoesSistema() {};
    private static InformacoesSistema instance = new InformacoesSistema();
    public static InformacoesSistema getInstance() {
        return instance;
    }

    private String nomeBiblioteca;
    private int diasParaEntrega;
    private double valorMultaDiaria;

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public int getDiasParaEntrega() {
        return diasParaEntrega;
    }

    public void setDiasParaEntrega(int diasParaEntrega) {
        this.diasParaEntrega = diasParaEntrega;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    public void setValorMultaDiaria(double valorMultaDiaria) {
        this.valorMultaDiaria = valorMultaDiaria;
    }
}
