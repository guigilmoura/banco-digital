import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf; //string provisóriamente, até criar um sistema de validação
    private String senha;
    public Conta conta;


    public Cliente(String nome, String cpf, String senha, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        conta.nomeTitular = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", cpf='" + cpf+"'}";
    }

}
