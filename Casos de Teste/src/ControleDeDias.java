/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class ControleDeDias {
    public boolean podeAgendarNoDia(String dia) {
        String diaLowerCase = dia.toLowerCase();
        return diaLowerCase.equals("segunda") ||
               diaLowerCase.equals("terca") ||
               diaLowerCase.equals("quarta") ||
               diaLowerCase.equals("quinta") ||
               diaLowerCase.equals("sexta") ||
               diaLowerCase.equals("sabado"); 
    }
}
