import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList<>();
        Conta contaCorrenteJoao = new ContaCorrente();
        Cliente joao = new Cliente("joao", "1" +
                "", "2", contaCorrenteJoao);
        contaCorrenteJoao.cliente = joao;
        listaDeClientes.add(joao);
        Conta contaInvestimentosMaria = new ContaInvestimentos();
        Cliente maria = new Cliente("maria", "654321", "senhadamaria", contaInvestimentosMaria);
        listaDeClientes.add(maria);

        /*System.out.println("depositando 100 na conta de joão");

        contaCorrenteJoao.depositar(100);

        System.out.println("\n");

        System.out.println("depositando 150 na conta de joão");

        contaCorrenteJoao.depositar(150);

        System.out.println("\n");

        System.out.println("sacando 20 da conta de joão");

        contaCorrenteJoao.sacar(20);

        System.out.println("\n");

        System.out.println("depositando 100 na conta de maria");

        contaInvestimentosMaria.depositar(100);

        System.out.println("\n");

        System.out.println("transferindo 50 e joão para maria");

        contaCorrenteJoao.pix(50, contaInvestimentosMaria);

        System.out.println("\n");

        System.out.println("imprimindo saldo de joão");

        contaCorrenteJoao.imprimirSaldo();

        System.out.println("\n");

        System.out.println("imprimindo saldo de maria");

        contaInvestimentosMaria.imprimirSaldo();

        System.out.println("\n");

        System.out.println("---imprimindo histórico da conta de " + contaCorrenteJoao.getNomeTitular() + "---");

        contaCorrenteJoao.imprimirHistorico();

        System.out.println("\n");

        System.out.println("---imprimindo histórico da conta de " + contaInvestimentosMaria.getNomeTitular() + "---");

        contaInvestimentosMaria.imprimirHistorico();

        contaInvestimentosMaria.imprimirRendimentoEstimado();*/

        Terminal.terminalAutenticacao(listaDeClientes);

    }
}

