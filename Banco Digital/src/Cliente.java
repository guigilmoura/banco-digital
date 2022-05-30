public class Cliente {
    private String nome;
    private String cpf; //string provisóriamente, até criar um sistema de validação
    private String senha;

    public Cliente(String nome, String cpf, String senha, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        conta.nomeTitular = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
