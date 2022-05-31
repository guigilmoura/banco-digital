import java.util.List;

public interface OperacoesBasicasConta {
    void depositar(double valor);
    void sacar(double valor);
    void pix(double valor, Conta destino);
    void imprimirHistorico();
    void imprimirSaldo();
    void imprimirRendimentoEstimado();
    double calcularRendimento();
}
