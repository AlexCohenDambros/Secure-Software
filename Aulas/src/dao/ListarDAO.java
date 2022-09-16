package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ListarDAO {

    private Conexao con;
    private ResultSet rs;

    PreparedStatement ps;

    public ListarDAO() {
        con = new Conexao();
    }

    public List<Usuario> listarUsers() {

        LinkedList<Usuario> listUsers = new LinkedList<>();

        try {
            String query = "SELECT email FROM pessoa;";
            ps = con.getConexao().prepareStatement(query);
            this.rs = ps.executeQuery();

            while(rs.next()) {
                listUsers.add(new Usuario(rs.getString(1), ""));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listUsers;
    }
}
