package Testes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TesteJDBC {
    // main
    public static void main(String[] args) {
        Connection        conn      = null;
        DBConnection      bd        = new DBConnection();
        PreparedStatement stm       = null;
        String            sqlString = "INSERT INTO tbLivro(titulo, edicao) VALUES ('O ABC do Java', 2)";
        try {
            // conecta com banco de dados
            conn = bd.conectar();
            // determina PreparedStatement
            stm = conn.prepareStatement(sqlString);
            // efetua INSERT
            stm.execute();
            // fecha conexão
            conn.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}