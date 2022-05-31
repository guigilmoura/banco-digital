import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public class Terminal {
    public static void terminal() {
        int entrada = 0;
        try {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - deposito\n2 - saque\n3 - pix\n4 - imprimir histórico\n0 - sair"));
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida. Certifique-se de que escolheu uma das opções válidas");
        }
        switch(entrada){
            case 0:
                JOptionPane.showMessageDialog(null,"Operação encerrada com sucesso.");
                break;
            case 1:
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado"));
                Autenticacao.contaAberta.depositar(valor);
                JOptionPane.showMessageDialog(null,"Novo saldo da conta ("+(Autenticacao.contaAberta.numeroDeConta+"):    R$"+new DecimalFormat("##.##").format(Autenticacao.contaAberta.saldo)));
                terminal();
            case 2:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado"));
                Autenticacao.contaAberta.sacar(valor);
                JOptionPane.showMessageDialog(null,"Novo saldo da conta ("+(Autenticacao.contaAberta.numeroDeConta+"):    R$"+new DecimalFormat("##.##").format(Autenticacao.contaAberta.saldo)));
                terminal();
            case 3:
                JOptionPane.showMessageDialog(null,"Não consegui pedir um objeto do tipo Conta para o usuário, para passar como conta destino...ainda estou precisando aprender mais sobre a Orientação a objeto");
            case 4:
                Autenticacao.contaAberta.imprimirHistorico();
        }
    }

    public static void terminalAutenticacao(List<Cliente> listaDeClientes) {
        if (Autenticacao.login(listaDeClientes)) {
            JOptionPane.showMessageDialog(null, "Bem vindo ao terminal para clientes");
            terminal();
        }
    }
}
