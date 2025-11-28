import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author aluno
 */
public class ExpedienteTecnicos {
    private static final long LIMITE_HORAS_EXPEDIENTE = 8;
    public boolean verificarExpediente(LocalDateTime entrada, LocalDateTime saida) {
        if (saida.isBefore(entrada) || saida.isEqual(entrada)) {
            return false;
        }
        long horasTrabalhadas = ChronoUnit.HOURS.between(entrada, saida);
        return horasTrabalhadas <= LIMITE_HORAS_EXPEDIENTE;
    }
}

