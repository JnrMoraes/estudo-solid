package D_ependencyInversion.inversao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {


    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:3306/materias_notas_aluno?verifyCertificate=false&useSSL=true";
            final String usuario = "root";
            final String senha = "root";

            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
