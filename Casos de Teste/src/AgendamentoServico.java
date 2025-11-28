/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class AgendamentoServico {
    public boolean agendar(String servico){
            return servico.equalsIgnoreCase("limpeza") ||
                   servico.equalsIgnoreCase("manutencao") ||
                   servico.equalsIgnoreCase("instalacao");
    }
}
