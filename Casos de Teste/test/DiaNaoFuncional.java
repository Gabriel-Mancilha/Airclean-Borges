import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class DiaNaoFuncional {
    @Test
    public void TestarAgendamentoEmDomingoFalha(){
        String diaDeTeste = "domingo";
        ControleDeDias controle = new ControleDeDias();
        assertEquals(false, controle.podeAgendarNoDia(diaDeTeste));
    }
}
