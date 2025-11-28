import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class MarcarServicos {   
    @Test
    public void SelecionarServiço(){
        String servico = "limpeza";  // serviço escolhido
        AgendamentoServico ag = new AgendamentoServico();
        assertEquals(true, ag.agendar(servico));
    }
}
