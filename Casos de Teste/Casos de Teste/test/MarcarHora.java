import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class MarcarHora {
    
    public MarcarHora() {
        
    }
    
    public class Agendamento {
        
        public boolean agendar(float hora){
            return hora >= 8.0f && hora <= 18.0f;
        }
    }
    
    @Test
    public void SelecionarHora(){
        float hora = 10.5f;
        Agendamento ag = new Agendamento();
        assertEquals(true, ag.agendar(hora));
    }
}
