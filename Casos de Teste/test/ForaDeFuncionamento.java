import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ForaDeFuncionamento {
    
   @Test
    public void TestarHorarioForaDoExpediente(){
        //inválida (antes das 8:00)
        float horaInvalida = 7.0f;       
        Confirmacao controle = new Confirmacao();
        assertEquals(false, controle.validarHorarioExpediente(horaInvalida));
    }
}