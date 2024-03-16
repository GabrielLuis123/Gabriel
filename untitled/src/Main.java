import Social.Comentario;
import Social.Postagem;
import Social.Usuario;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Postagem> postagems = new ArrayList<>();
        Usuario usuario1 = new Usuario("Gabriel", "tad-gabrielaraujo@ucpparana.edu.br", "senha123", "03/02/2005", postagems);
        Comentario comentario1 = new Comentario("Muito bom, Gostei !", usuario1, "15/03/2024");
        ArrayList<Comentario> comentariosPostagemUso1 = new ArrayList<>();

        Postagem postagemUsuario1 = new Postagem("Postagem fodase", "22/02/2000",10, comentariosPostagemUso1);
        comentariosPostagemUso1.add(comentario1);
        postagemUsuario1.setComentarios(comentariosPostagemUso1);

    }
}