import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";

    private static final String USUARIO = "KFINANCE";

    private static final String SENHA = "MarKa78!";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
