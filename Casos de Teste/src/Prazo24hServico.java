import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author aluno
 */
public class Prazo24hServico {
  private static final long limite_de_cancelamento = 24;
    public boolean verificarPrazo(LocalDateTime agendamentoOriginal, LocalDateTime horaAtualSolicitacao) {

        if (agendamentoOriginal.isBefore(horaAtualSolicitacao)) {
            return false; 
        }
        long horasRestantes = ChronoUnit.HOURS.between(horaAtualSolicitacao, agendamentoOriginal);
        return horasRestantes >= limite_de_cancelamento;
    }
}