public class ResgateInvest {

    // ATRIBUTOS
    double valorResgate;
    String tipoResgate;

    // CONSTRUTOR
    public ResgateInvest(){

    }

    // CONSTRUTOR COM PARAMETROS
    public ResgateInvest(double valorResgate, String tipoResgate){
        this.valorResgate = valorResgate;
        this.tipoResgate = tipoResgate;
    }

    public double getValorResgate() {
        return valorResgate;
    }

    public void setValorResgate(double valorResgate) {
        this.valorResgate = valorResgate;
    }

    public String getTipoResgate() {
        return tipoResgate;
    }

    public void setTipoResgate(String tipoResgate) {
        this.tipoResgate = tipoResgate;
    }

    // METODOS
    public void resgate(){
        System.out.println("Valor resgate: " + getValorResgate());
        System.out.println("Tipo Investimento: " + getTipoResgate());
    }
}

