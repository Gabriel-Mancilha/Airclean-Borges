import java.time.LocalDateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Prazo24hServicoTest {
    
     private final Prazo24hServico servico = new Prazo24hServico();
    private final LocalDateTime agendamento_o = LocalDateTime.of(2026, 1, 15, 14, 0);
    @Test
    public void devePermitirComFolgaDeTempo() {
        LocalDateTime horaAtual = LocalDateTime.of(2026, 1, 13, 14, 0);
        boolean permitido = servico.verificarPrazo(agendamento_o, horaAtual);
        assertTrue("Deve ser permitido com 48 horas de antecedência", permitido);
    }
}