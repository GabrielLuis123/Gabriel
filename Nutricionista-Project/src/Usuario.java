public class Usuario {
    private String nome;
    private String email;
    private String cpf;
    private Float Peso;
    private Float Altura;
    public Usuario() {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.Peso = Peso;
        this.Altura = Altura;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float peso) {
        Peso = peso;
    }

    public Float getAltura() {
        return Altura;
    }

    public void setAltura(Float altura) {
        Altura = altura;
    }

    public void adicionarUsuario(Usuario gabriel) {
    }

    public void listarUsuarios() {
    }
}