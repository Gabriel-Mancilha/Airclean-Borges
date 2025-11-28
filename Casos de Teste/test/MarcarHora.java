import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class MarcarHora {
    @Test
    public void SelecionarHora(){
        float hora = 10.5f;
        Agendamento ag = new Agendamento();
        assertEquals(true, ag.agendar(hora));
    }
}