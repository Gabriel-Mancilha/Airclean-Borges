/**
 *
 * @author aluno
 */
public class CalculadoraFrete {
    private static final double limite_gratuito = 20.0;
    private static final double taxa = 3.50; 
    private static final double custo_base = 50.00; // Custo base do serviço

    /**
     * Calcula o custo total do serviço.
     * @param distanciaKm Distância total percorrida em quilômetros.
     * @return O valor total a ser cobrado.
     */
    public double calcularCustoTotal(double distanciaKm) {
        double custoTotal = custo_base;
        
        // Se a distância for maior que 20km, a taxa é aplicada (mantemos a lógica, mas não a testaremos abaixo)
        if (distanciaKm > limite_gratuito) {
            double kmExcedidos = distanciaKm - limite_gratuito;
            double taxaAdicional = kmExcedidos * taxa;
            custoTotal += taxaAdicional;
        }
        
        return custoTotal;
    }
}