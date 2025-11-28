import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class DiaUtil {
    @Test
    public void TestarAgendamentoEmDiaUtil(){
        //dia útil para teste
        String diaDeTeste = "quarta"; 
        ControleDeDias controle = new ControleDeDias();
        assertEquals(true, controle.podeAgendarNoDia(diaDeTeste));
    }
}
