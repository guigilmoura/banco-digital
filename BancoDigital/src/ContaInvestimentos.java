import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.LinkedList;

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
        System.out.println("Valor esperado = R$" + x);
    }

    @Override
    public double calcularRendimento() {
        int t = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de meses do rendimento"));
        return this.getSaldo() * (Math.pow((1 + 1 / 100d), t));
    }
}