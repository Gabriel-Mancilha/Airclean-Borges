/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Confirmacao {
 private static final float HORA_INICIO_EXPEDIENTE = 8.0f;
    private static final float HORA_FIM_EXPEDIENTE = 17.0f; 

    /**
     * Verifica se a hora fornecida está dentro do horário de expediente.
     * @param hora A hora a ser verificada (ex: 8.5f para 08:30).
     * @return true se a hora estiver entre 8:00 e 17:00 (inclusive), false caso contrário.
     */
    public boolean validarHorarioExpediente(float hora) {
        // A expressão booleana é o valor de retorno, resolvendo a redundância do IF.
        return hora >= HORA_INICIO_EXPEDIENTE && hora <= HORA_FIM_EXPEDIENTE;
    }
}