import javax.swing.*;
import conn.DBConnection;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Principal {
	
	// main
    public static void main(String[] args) {
    	Connection        conn      = null;
        DBConnection      bd        = new DBConnection();
        PreparedStatement stm       = null;
        String            sqlString = "INSERT INTO countrylanguage(CountryCode, Language, IsOfficial, Percentage) VALUES (XXX, 'unip2021', 'T', 7.0)";
        try {

            conn = bd.conectar();

            stm = conn.prepareStatement(sqlString);

            stm.execute();
            // fecha conexão
            conn.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
