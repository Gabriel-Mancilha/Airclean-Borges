import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendamentoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> horariosOcupados = new ArrayList<>();
        horariosOcupados.add("09:00");
        horariosOcupados.add("14:30");

        // Exibir opções de serviço
        System.out.println("Selecione o codigo do servico desejado:");
        System.out.println("1 - Limpeza de ar-condicionado");
        System.out.println("2 - Manutencao de ar-condicionado");
        System.out.println("3 - Instalacao de ar-condicionado");
        System.out.print("Digite o codigo do servico: ");
        int codigoServico = sc.nextInt();
        sc.nextLine();

        String servico = "";
        switch (codigoServico) {
            case 1:
                servico = "Limpeza de ar-condicionado";
                break;
            case 2:
                servico = "Manutenção de ar-condicionado";
                break;
            case 3:
                servico = "Instalação de ar-condicionado";
                break;
            default:
                System.out.println("Código de serviço inválido!");
                sc.close();
                return;
        }
        System.out.print("Selecione o horario desejado (formato com horas e minutos - 08:00 as 18:00): ");
        String horario = sc.nextLine();

        try {
            String[] partes = horario.split(":");
            int hora = Integer.parseInt(partes[0]);
            int minuto = Integer.parseInt(partes[1]);

            if (hora < 8 || hora > 18 || (hora == 18 && minuto > 0)) {
                System.out.println("horario fora do expediente!");
            } else if (horariosOcupados.contains(horario)) {
                System.out.println("horario indisponível. Escolha outro horario.");
            } else {
                System.out.println("Agendamento confirmado para " + servico + " as " + horario + ".");
            }
        } catch (Exception e) {
            System.out.println("Formato de horario invalido! Use o formato HH:MM (ex: 14:30)");
        }

        sc.close();
    }
}
