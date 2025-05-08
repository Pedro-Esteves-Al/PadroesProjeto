package padroesComportamentais.pedro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    public Aluno aluno;

    @BeforeEach
    void test() {
        aluno = new Aluno("Matriculado");
    }

    @Test
    void deveMatricularAluno() {
        assertEquals("Matriculado",aluno.getEstado());
    }

    @Test
    void deveTrancarAlunoMatriculado() {
        assertEquals(true,aluno.trancar(aluno.getEstado()));
    }

    @Test
    void deveJubilarAlunoMatriculado() {
        assertEquals(true,aluno.jubilar(aluno.getEstado()));
    }

    @Test
    void deveTransferirAlunoMatriculado() {
        assertEquals(true,aluno.transferir(aluno.getEstado()));
    }

    @Test
    void deveEvadirAlunoMatriculado() {
        assertEquals(true,aluno.evadir(aluno.getEstado()));
    }

    @Test
    void deveFormarAlunoMatriculado() {
        assertEquals(true,aluno.formar(aluno.getEstado()));
    }
    @Test
    void deveMatricularAlunoTrancado() {
        aluno.setEstado("Trancado");
        assertEquals(true,aluno.matricular(aluno.getEstado()));
    }
}