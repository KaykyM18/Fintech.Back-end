public class CadastroCliente {

    // ATRIBUTOS
    String nome;
    String genero;
    String email;
    String senha;
    String comfirmarSenha;

    // CONSTRUTOR SIMPLES
    public CadastroCliente() {

    }

    // CONSTRUTOR COM PARAMETROS
    public CadastroCliente(String nome, String genero, String email, String senha, String comfirmarSenha){
        this.nome = nome;
        this.genero = genero;
        this. email = email;
        this.senha = senha;
        this.comfirmarSenha = comfirmarSenha;
    }

    public String getComfirmarSenha() {
        return comfirmarSenha;
    }

    public void setComfirmarSenha(String comfirmarSenha) {
        this.comfirmarSenha = comfirmarSenha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // METODOS
    public void cadastro(){
        System.out.println("Nome Completo: " + getNome());
        System.out.println("Genero: " + getGenero());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("Confirmar Senha: " + getComfirmarSenha());
    }
}
