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
//            Errado
//            String query = "INSERT INTO pessoa (email, senha) VALUES ('" + u.getEmail() + "', '" + u.getSenha() + "')";
//
//            ps = conexao.getConexao().prepareStatement(query);

//             CERTO
            String query = "INSERT INTO pessoa (email, senha) VALUES (?,?)";
            ps = conexao.getConexao().prepareStatement(query);
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getSenha());


            ps.execute();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
