import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ConfirmacaoAgendamento {

    @Test
    public void TestarHorarioDentroDoExpediente(){
        float horaValida = 10.0f; 
        Confirmacao controle = new Confirmacao();
        assertEquals(true, controle.validarHorarioExpediente(horaValida));
    } 
}
