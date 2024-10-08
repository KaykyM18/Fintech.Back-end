public class Login {
    // ATRIBUTOS
    String cpf;
    String senha;

    // CONSTRUTORES SIMPLES
    public Login(){

    }

    // CONSTRUTOR COM PARAMETROS
    public Login(String cpf, String password){
        this.cpf = cpf;
        this.senha = password;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // METODO
    public void efetuarLogin(){
        System.out.println("Seja Bem-Vindo " + cpf);
    }

}