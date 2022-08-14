package alpooTeoAula07;
import alpooTeoAula05.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class LivroDAO extends Livro {
    // atributo
    private final String banco = "unip_alpoo";
    // construtores
    public LivroDAO() {
        super(0, "", 0);
    }
    public LivroDAO(int idLivro) {
        super(idLivro, "", 0);
    }
    public LivroDAO(String titulo) {
        super(0, titulo, 0);
    }
    public LivroDAO(String titulo, int edicao) {
        super(0, titulo, edicao);
    }
    public LivroDAO(int idLivro, String titulo, int edicao) {
        super(idLivro, titulo, edicao);
    }
    // inserir
    public void inserir() throws SQLException {
        int    msgIcon;
        String msg;
        try {
            msgIcon = JOptionPane.WARNING_MESSAGE;
            msg     = "Livro inserido com sucesso!";
            String            sqlString = "INSERT INTO tbLivro(titulo, edicao) VALUES (?, ?)";
            DBConnection      db        = new DBConnection(banco);
            Connection        conn      = db.conectar();
            PreparedStatement ps        = conn.prepareStatement(sqlString);
            ps.setString(1, getTitulo());
            ps.setInt   (2, getEdicao());
            ps.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, msg, "Inserindo livros...", msgIcon);
        }
        catch (SQLException sqlExc) {
            msgIcon = JOptionPane.ERROR_MESSAGE;
            msg     = "Problema de conexão com o BANCO DE DADOS!\n\nFaça contato com o HELP DESK!" +
                      "\n\nERRO: " + sqlExc.getMessage();
            JOptionPane.showMessageDialog(null, msg, "Inserindo livros...", msgIcon);
            throw new SQLException();
        }
    }
    // alterar
    public void alterar() throws SQLException {
        int    msgIcon;
        String msg;
        try {
            msgIcon = JOptionPane.WARNING_MESSAGE;
            msg     = "Livro alterado com sucesso!";
            String            sqlString = "UPDATE tbLivro SET titulo = ?, edicao = ? WHERE idLivro = ?";
            DBConnection      db        = new DBConnection(banco);
            Connection        conn      = db.conectar();
            PreparedStatement ps        = conn.prepareStatement(sqlString);
            ps.setString(1, getTitulo());
            ps.setInt   (2, getEdicao());
            ps.setInt   (3, getIdLivro());
            ps.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, msg, "Inserindo livros...", msgIcon);
        }
        catch (SQLException sqlExc) {
            msgIcon = JOptionPane.ERROR_MESSAGE;
            msg     = "Problema de conexão com o BANCO DE DADOS!\n\nFaça contato com o HELP DESK!" +
                      "\n\nERRO: " + sqlExc.getMessage();
            JOptionPane.showMessageDialog(null, msg, "Alterando livros...", msgIcon);
            throw new SQLException();
        }
    }
    // alterar
    public void excluir() throws SQLException {
        int    msgIcon;
        String msg;
        try {
            msgIcon = JOptionPane.WARNING_MESSAGE;
            msg     = "Livro eliminado com sucesso!";
            String            sqlString = "DELETE FROM tbLivro WHERE idLivro = ?";
            DBConnection      db        = new DBConnection(banco);
            Connection        conn      = db.conectar();
            PreparedStatement ps        = conn.prepareStatement(sqlString);
            ps.setInt(1, getIdLivro());
            ps.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, msg, "Inserindo livros...", msgIcon);
        }
        catch (SQLException sqlExc) {
            msgIcon = JOptionPane.ERROR_MESSAGE;
            msg     = "Problema de conexão com o BANCO DE DADOS!\n\nFaça contato com o HELP DESK!" +
                      "\n\nERRO: " + sqlExc.getMessage();
            JOptionPane.showMessageDialog(null, msg, "Excluindo livros...", msgIcon);
            throw new SQLException();
        }
    }
    // alterar
    public ArrayList<Livro> carregar() throws SQLException {
        ArrayList<Livro> lista = new ArrayList<Livro>();
        try {
            String            sqlString = "SELECT * FROM tbLivro";
            DBConnection      db        = new DBConnection(banco);
            Connection        conn      = db.conectar();
            PreparedStatement ps        = conn.prepareStatement(sqlString);
            ResultSet         rs        = ps.executeQuery();
            while (rs.next()) {
                Livro novoLivro = new Livro();
                novoLivro.setIdLivro(rs.getInt   ("idLivro"));
                novoLivro.setTitulo (rs.getString("titulo"));
                novoLivro.setEdicao (rs.getInt   ("edicao"));
                lista.add( novoLivro );
            }
            conn.close();
        }
        catch (SQLException sqlExc) {
            int    msgIcon = JOptionPane.ERROR_MESSAGE;
            String msg     = "Problema de conexão com o BANCO DE DADOS!\n\nFaça contato com o HELP DESK!" +
                      "\n\nERRO: " + sqlExc.getMessage();
            JOptionPane.showMessageDialog(null, msg, "Alterando livros...", msgIcon);
            throw new SQLException();
        }
        return lista;
    }
}