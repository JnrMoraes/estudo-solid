package conexaomysql.conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        final String url = "jdbc:mysql://localhost:3306?verifyCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "root";
        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);

        System.out.println("Conexão efetuado com seucesso!");

        conexao.close();

    }
}
