/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class AutenticarUsuario {
    public boolean login(String login, String senha) {
        final String email = "teste@gmail.com";
        final String senhaC = "12345";
        //verificar senha e email
        return login.equals(email) && senha.equals(senhaC);
    }
}