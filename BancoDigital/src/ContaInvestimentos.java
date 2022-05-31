import javax.swing.*;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class ContaInvestimentos extends Conta {
    private float indiceRendimento;
    private float rendimentoPeriodico;

    public ContaInvestimentos() {
        super.historico = new LinkedList<>();
    }

    @Override
    public void imprimirRendimentoEstimado() {
        double y = calcularRendimento();
        String x = new DecimalFormat("##.##").format(y);
        System.out.println("---imprimindo estimativa de saldo após rendimento pelo número de meses desejado (taxa de rendimento de 1% ao mês)---");
        System.out.println("Valor esperado = R$" + x);
    }

    @Override
    public double calcularRendimento() {
        int t = 0;
        try {
            t = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de meses do rendimento"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, certifique-se de que o número de meses é um valor numerico válido");
        }
        return this.getSaldo() * (Math.pow((1 + 1 / 100d), t));
    }
}