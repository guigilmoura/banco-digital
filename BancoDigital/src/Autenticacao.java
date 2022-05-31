import javax.swing.*;
import java.util.Iterator;
import java.util.List;

public class Autenticacao {
    public static Conta contaAberta;

    public static boolean login(List<Cliente> listaDeClientes) {
        boolean loginEncontrado = false;
        boolean autenticado = false;
        String login = JOptionPane.showInputDialog("Digite o CPF para fazer login");
        Iterator<Cliente> iterator = listaDeClientes.iterator();
        while (iterator.hasNext() && !autenticado){
            Cliente clienteAtual = iterator.next();
            if (clienteAtual.getCpf().equals(login)){
                loginEncontrado = true;
                String senha = JOptionPane.showInputDialog("Digite a senha para fazer login");
                if (senha.equals(clienteAtual.getSenha())){
                    autenticado = true;
                    contaAberta = clienteAtual.getConta();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Autenticação inválida");
                    break;
                }
            }
        }
        if (!loginEncontrado)
            JOptionPane.showMessageDialog(null, "Login não encontrado, entre em contato para abrir sua conta!");
        return autenticado;
    }
}
