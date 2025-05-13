package padroesComportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {
    public Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

    //Internar
    @Test
    public void naoDeveInternarPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertFalse(paciente.internar());
    }
    @Test
    public void deveDarAltaEmPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.darAlta());
        assertEquals(PacienteEstadoAlta.getInstance(), paciente.getEstado());
    }
    @Test
    public void deveEnviarImlEmPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.enviarIml());
        assertEquals(PacienteEstadoIml.getInstance(), paciente.getEstado());
    }
    @Test
    public void deveEnviarUtiEmPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.enviarUti());
        assertEquals(PacienteEstadoUti.getInstance(), paciente.getEstado());
    }
    // Enviar pro Iml
    //tem que trocar esse aqui
//    @Test
//    public void deveEnviarImlPacienteInternado() {
//        paciente.setEstado(PacienteEstadoInternado.getInstance());
//        assertTrue(paciente.enviarIml());
//        assertEquals(PacienteEstadoIml.getInstance(), paciente.getEstado());
//    }
    @Test
    public void NaoDeveDarAltaEmPacienteIml() {
        paciente.setEstado(PacienteEstadoIml.getInstance());
        assertFalse(paciente.darAlta());
    }
    @Test
    public void NaoDeveInternarPacienteIml() {
        paciente.setEstado(PacienteEstadoIml.getInstance());
        assertFalse(paciente.internar());
    }
    @Test
    public void NaoDeveEnviarUtiPacienteIml() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertFalse(paciente.enviarUti());
    }
}