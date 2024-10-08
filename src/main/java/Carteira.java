public class Carteira {

    // ATRIBUTOS
    double valorSaldo;

    // CONSTRUTOR
    public Carteira(){

    }

    // CONSTRUTOR COM PARAMETROS
    public Carteira(double valorSaldo){
        this.valorSaldo = valorSaldo;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    // METODO
    public void saldo(){
        System.out.println("Saldo da Carteira: " + getValorSaldo());
    }
}

