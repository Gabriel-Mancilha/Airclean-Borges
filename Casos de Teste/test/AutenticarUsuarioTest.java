import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class AutenticarUsuarioTest {
    
    private final AutenticarUsuario autenticador = new AutenticarUsuario();
    @Test
    public void deveAutenticarClienteComCredenciaisCorretas() {
        String login = "teste@gmail.com";
        String senha = "12345";
        boolean sucesso = autenticador.login(login, senha);
        assertTrue("A autenticação do cliente deve ser bem-sucedida", sucesso);
    }
    
}
