import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Login acesso = new Login();

        acesso.cpf = "123.456.789-10";
        acesso.senha = "anjinho123";

        acesso.efetuarLogin();

        System.out.println("---------------------------------------");

        CadastroCliente cadastrar = new CadastroCliente();
        cadastrar.nome = "Maya Alves";
        cadastrar.genero = "Feminina";
        cadastrar.email = "Malvezs@gmail.com";
        cadastrar.senha = "Anjinho1";
        cadastrar.comfirmarSenha = "Anjinho1";

        cadastrar.cadastro();

        System.out.println("---------------------------------------");

        AplicacaoInvest inves = new AplicacaoInvest();
        inves.valorInvestimento = 2500;
        inves.tipoInvestimento = "LCI";
        inves.porcentagemCDI = "98% do CDI";

        inves.aplicacao();

        System.out.println("---------------------------------------");

        ResgateInvest resg = new ResgateInvest();
        resg.valorResgate = 1000;
        resg.tipoResgate = "CDI";

        resg.resgate();

        System.out.println("---------------------------------------");

        Carteira saldo1 = new Carteira();
        saldo1.valorSaldo = 1456.38;

        saldo1.saldo();

        Extrato positivo = new Extrato();
        positivo.lancamentos = 50.00;

        positivo.lancPositivo();

        Extrato negativo = new Extrato();
        negativo.lancamentos = -120.00;

        negativo.lancNegativo();

        try {
            Connection conexao = ConnectionFactory.getConnection();
            System.out.println("Conexão Realizada!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        try {
            Connection conexao = ConnectionFactory.getConnection();
            Statement stm = conexao.createStatement();
            stm.executeUpdate("INSERT INTO ENDERECO (CPF, CEP, LOGRADOURO, NUMERO, BAIRRO, PONTO_REFERENCIA) VALUES ('12345678910', '06112-010', 'AVENIDA HORACIO LAFER', 86, 'JARDIM DAS FLORES', NULL)");
            System.out.println("Cliente Inserido!");
            stm.close();
            conexao.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}