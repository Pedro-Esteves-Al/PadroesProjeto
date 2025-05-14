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
    public void deveEnviarImlPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.enviarIml());
        assertEquals(PacienteEstadoIml.getInstance(), paciente.getEstado());
    }
    @Test
    public void deveEnviarUtiPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.enviarUti());
        assertEquals(PacienteEstadoUti.getInstance(), paciente.getEstado());
    }
    // Enviar pro Iml
    @Test
    public void naoDeveEnviarImlPacienteIml() {
        paciente.setEstado(PacienteEstadoIml.getInstance());
        assertFalse(paciente.enviarIml());
    }
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
    // Estado UTI
    @Test
    public void naoDeveEnviarUtiPacienteUti() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertFalse(paciente.enviarUti());
    }

    @Test
    public void deveEnviarImlPacienteUti() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertTrue(paciente.enviarIml());
        assertEquals(PacienteEstadoIml.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveDarAltaPacienteUti() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertTrue(paciente.darAlta());
        assertEquals(PacienteEstadoAlta.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveInternarPacienteUti() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertFalse(paciente.internar());
    }

    // Estado Alta
    @Test
    public void naoDeveDarAltaPacienteComAlta() {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        assertFalse(paciente.darAlta());
    }

    @Test
    public void naoDeveEnviarImlPacienteComAlta() {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        assertFalse(paciente.enviarIml());
    }

    @Test
    public void naoDeveEnviarUtiPacienteComAlta() {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        assertFalse(paciente.enviarUti());
    }

    @Test
    public void naoDeveInternarPacienteComAlta() {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        assertFalse(paciente.internar());
    }
}