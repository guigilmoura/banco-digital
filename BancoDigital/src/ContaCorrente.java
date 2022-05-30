import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
        super.historico = new LinkedList<>();
    }

    @Override
    public void imprimirRendimentoEstimado() {

    }

    @Override
    public double calcularRendimento() {
        return 0;
    }

}
