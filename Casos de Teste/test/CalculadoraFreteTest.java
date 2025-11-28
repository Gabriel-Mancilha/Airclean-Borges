import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class CalculadoraFreteTest {
    private final CalculadoraFrete calculadora = new CalculadoraFrete();
    
    private static final double custo_base = 50.00; 
    @Test
    public void deveManterCustoBaseSeDistanciaForMenorQueOLimite() {
        double distancia = 15.0; 
        double custoFinal = calculadora.calcularCustoTotal(distancia);
        assertEquals("O custo deve ser apenas o Custo Base (R$ 50.00) para 15km", 
                     custo_base, custoFinal, 0.001); 
    }
}