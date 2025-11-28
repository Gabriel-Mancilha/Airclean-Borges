import java.time.LocalDateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ExpedienteTecnicosTest {
    private final ExpedienteTecnicos servico = new ExpedienteTecnicos();
    private final LocalDateTime ENTRADA_BASE = LocalDateTime.of(2025, 12, 5, 9, 0); 
    
    @Test
    public void Exatamente8Horas() {
        LocalDateTime saida = ENTRADA_BASE.plusHours(8);
        boolean permitido = servico.verificarExpediente(ENTRADA_BASE, saida);
        assertTrue("Deve ser permitido, pois o expediente de 8 horas foi atingido, mas não excedido", permitido);
    }
   
}
