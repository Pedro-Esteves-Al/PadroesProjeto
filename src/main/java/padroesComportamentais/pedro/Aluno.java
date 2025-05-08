package padroesComportamentais.pedro;

public class Aluno {
    private String estado;

    public Aluno (String estado) {
        this.estado = "Matriculado";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean matricular(String estado) {
        if (estado == "Trancado") {
            return true;
        } else {
            return false;
        }
    }
    public boolean trancar(String estado) {
        if (estado == "Matriculado") {
            return true;
        } else {
            return false;
        }
    }
    public boolean jubilar(String estado) {
        if (estado == "Matriculado") {
            return true;
        } else {
            return false;
        }
    }
    public boolean transferir(String estado) {
        if (estado == "Matriculado" || estado != "Trancado") {
            return true;
        } else {
            return false;
        }
    }
    public boolean evadir(String estado) {
        if (estado == "Matriculado") {
            return true;
        } else {
            return false;
        }
    }
    public boolean formar(String estado) {
        if (estado == "Matriculado") {
            return true;
        } else {
            return false;
        }
    }
}
