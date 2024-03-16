package Social;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    //Esta classe vai ter que fazer uma postagem
    //Esta classe vai ter relacao com a classe Postagem
    //Esta Classe ela pode interagir com a postagem
    private String nome;
    private String email;
    private String senha;
    private String nascimento;

    private ArrayList<Postagem> postagens;

    public Usuario(String nome, String email, String senha, String nascimento, ArrayList<Postagem> postagens){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nascimento = nascimento;
        this.postagens = postagens;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public ArrayList<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(ArrayList<Postagem> postagens) {
        this.postagens = postagens;
    }
    public void comentar(){

    }
}
