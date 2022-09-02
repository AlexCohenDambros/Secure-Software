package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastrarUser {
    private Conexao conexao;
    private ResultSet rs;
    PreparedStatement ps;

    public CadastrarUser() {
        conexao = new Conexao();
    }

    public Boolean insertUser(Usuario u) {
        try {
            String query = "INSERT INTO pessoa (email, senha) VALUES ('" + u.getEmail() + "', '" + u.getEmail() + "')";
            ps = conexao.getConexao().prepareStatement(query);
            this.rs = ps.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
