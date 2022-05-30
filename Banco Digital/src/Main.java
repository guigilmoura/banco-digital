public class Main {
    public static void main(String[] args) {
        Conta continha = new ContaCorrente();
        Conta continha2 = new ContaInvestimentos();
        Cliente gui = new Cliente("joão", "123456", "senhadojoão", continha);
        Cliente bru = new Cliente("maria", "654321", "senhadamaria", continha2);

        System.out.println("depositando 100 na conta de joão");
        continha.depositar(100);
        System.out.println("\n");
        System.out.println("depositando 150 na conta de joão");
        continha.depositar(150);
        System.out.println("\n");
        System.out.println("sacando 20 da conta de joão");
        continha.sacar(20);
        System.out.println("\n");
        System.out.println("depositando 100 na conta de maria");
        continha2.depositar(100);
        System.out.println("\n");
        System.out.println("transferindo 50 e joão para maria");
        continha.transferir(50, continha2);
        System.out.println("\n");
        System.out.println("imprimindo saldo de joão");
        continha.imprimirSaldo();
        System.out.println("\n");
        System.out.println("imprimindo saldo de maria");
        continha2.imprimirSaldo();
        System.out.println("\n");
        System.out.println("---imprimindo histórico da conta de joão---");
        continha.imprimirHistorico();
        System.out.println("\n");
        System.out.println("---imprimindo histórico da conta de maria---");
        continha2.imprimirHistorico();


        continha2.imprimirRendimentoEstimado();

        //PROXIMAS IMPLEMENTAÇÕES: PEDIR SENHA, SIMULAR RENDIMENTOS--AHH, NAO ESQUEÇA DE CRIAR O REPOSITÓRIO SEPARADO

    }
}
