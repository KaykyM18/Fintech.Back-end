public class AplicacaoInvest {

    // ATRIBUTOS
    String tipoInvestimento;
    double valorInvestimento;
    String porcentagemCDI;

    // CONSTRUTOR SIMPLES
    public AplicacaoInvest(){

    }

    // CONSTRUTOR COM PARAMETROS
    public AplicacaoInvest(String tipoInvestimento, double valorInvestimento, String porcentagemCDI){
        this.tipoInvestimento = tipoInvestimento;
        this.valorInvestimento = valorInvestimento;
        this.porcentagemCDI = porcentagemCDI;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public String getPorcentagemCDI() {
        return porcentagemCDI;
    }

    public void setPorcentagemCDI(String porcentagemCDI) {
        this.porcentagemCDI = porcentagemCDI;
    }

    // MRTODOS
    public void aplicacao(){
        System.out.println("Valor Investido: " + getValorInvestimento());
        System.out.println("Tipo Investimento: " + getTipoInvestimento());
        System.out.println("Porcentagem: " + getPorcentagemCDI());
    }
}