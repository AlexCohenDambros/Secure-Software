package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastrarDAO {
    private Conexao conexao;
    private ResultSet rs;
    PreparedStatement ps;

    public CadastrarDAO() {
        conexao = new Conexao();
    }

    public Boolean insertUser(Usuario u) {
        try {
            String query = "INSERT INTO pessoa (email, senha) VALUES ('" + u.getEmail() + "', '" + u.getSenha() + "')";
            ps = conexao.getConexao().prepareStatement(query);

            ps.execute();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
