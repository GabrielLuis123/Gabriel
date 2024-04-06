import java.util.ArrayList;
import java.util.List;

public class Cadastrar_Usuario {
    private List<Usuario> usuarios;

    public Cadastrar_Usuario() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Cpf: " + usuario.getCpf());
            System.out.println("Peso: " + usuario.getPeso());
            System.out.println("Altura: " + usuario.getAltura());
        }
    }
}