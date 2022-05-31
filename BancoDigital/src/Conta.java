import java.time.Clock;
import java.util.Calendar;
import java.util.LinkedList;

public abstract class Conta implements OperacoesBasicasConta{

    protected String nomeTitular = null;
    protected int numeroDeConta;
    protected static int SEQUENCIAL = 1;
    protected static int agencia = 1;
    protected float saldo = 0;
    protected LinkedList<String> historico;

    public Conta(){
        this.numeroDeConta = SEQUENCIAL++;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeTitular = null;
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        this.historico.add("deposito : "+valor+" // Novo saldo = "+this.saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        this.historico.add("saque : "+valor+" // Novo saldo = "+this.saldo);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        destino.saldo += valor;
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = new java.util.Date();
        this.historico.add(date+"  -  transferência de "+valor+" para titular: "+destino.getNomeTitular()+
                "(conta:"+destino.getNumeroDeConta()+")"+" // Novo saldo = "+this.saldo);
        destino.historico.add("recebimento de "+valor+" de titular: "+destino.getNomeTitular()+
                "(conta:"+destino.getNumeroDeConta()+")"+" // Novo saldo = "+destino.saldo);
    }


    @Override
    public void imprimirHistorico() {
        for (String operacao : historico)
            System.out.println(operacao);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public static int getAgencia() {
        return agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public LinkedList<String> getHistorico() {
        return historico;
    }


    public abstract double calcularRendimento();
}
