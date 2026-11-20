package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Reserva reserva = new Reserva(1001, "Hospede 1", new Quarto(101, "Comum"), 3, 200.0, false);

        Reserva reservaClone = reserva.clone();
        reservaClone.setCodigo(1002);
        reservaClone.setHospede("Hospede 2");
        reservaClone.getQuarto().setNumero(202);
        reservaClone.getQuarto().setTipo("Luxo");

        assertEquals("Reserva{codigo=1001, hospede='Hospede 1', quarto=Quarto{numero=101, tipo='Comum'}, diarias=3, valorDiaria=200.0, altaTemporada=false}", reserva.toString());
        assertEquals("Reserva{codigo=1002, hospede='Hospede 2', quarto=Quarto{numero=202, tipo='Luxo'}, diarias=3, valorDiaria=200.0, altaTemporada=false}", reservaClone.toString());
    }

}