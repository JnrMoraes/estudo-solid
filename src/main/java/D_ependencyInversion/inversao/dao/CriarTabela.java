package D_ependencyInversion.inversao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

    public static void main(String[] args) throws SQLException {
        Connection conexao = ConexaoBanco.getConnection();
        String sql = "CREATE TABLE IF NOT EXISTS aluno(" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso");
        conexao.close();

    }
}
