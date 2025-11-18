import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class MarcarServicos {
    
    public MarcarServicos() {
    }
    public class AgendamentoServico {
        public boolean agendar(String servico){
            return servico.equalsIgnoreCase("limpeza") ||
                   servico.equalsIgnoreCase("manutencao") ||
                   servico.equalsIgnoreCase("instalacao");
        }
    }
    
    @Test
    public void SelecionarServiço(){
        String servico = "limpeza";  // serviço escolhido
        AgendamentoServico ag = new AgendamentoServico();
        assertEquals(true, ag.agendar(servico));
    }
}
