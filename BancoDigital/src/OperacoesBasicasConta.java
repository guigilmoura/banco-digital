public interface OperacoesBasicasConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta destino);
    void imprimirHistorico();
    void imprimirSaldo();
    void imprimirRendimentoEstimado();
    double calcularRendimento();
}
