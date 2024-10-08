public class Extrato extends Carteira {
    public double lancamentos;

    public Extrato(){
        super();
    }

    public Extrato(Double valorSaldo, double lancamentos){
        super(valorSaldo);
        this.lancamentos = lancamentos;
    }

    public double getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(double lancamentos) {
        this.lancamentos = lancamentos;
    }

    public void lancPositivo(){
        System.out.println("Valor Lançamento: " + getLancamentos());
    }

    public void lancNegativo(){
        System.out.println("Valor Lançamento: " + getLancamentos());
    }

}


