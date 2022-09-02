package controller;

import dao.ListarDAO;
import model.Usuario;
import view.ListarView;

import java.util.LinkedList;
import java.util.List;

public class ListarController {
    private ListarView lview;
    private ListarDAO ldao;

    public ListarController() {
        lview = new ListarView();
        ldao = new ListarDAO();

        try {
            List<Usuario> lista = ldao.listarUsers();
            lview.listUsuarios(lista);
        } catch (Exception ignored) {
            lview.usuarioNaoEcontrado();
        }
    }
}
