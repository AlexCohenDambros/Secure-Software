package controller;

import dao.AutenticacaoDAO;
import model.Usuario;
import view.AutenticacaoView;

public class AutenticacaoController {

    private AutenticacaoView aview;
    private Usuario usuario;
    private AutenticacaoDAO adao;

    public AutenticacaoController() {

        aview = new AutenticacaoView();
        usuario = aview.login(new Usuario());

        adao = new AutenticacaoDAO();
        if (adao.autenticarUsuario(usuario)) {
            aview.usuarioAutenticado();
        } else {
            aview.usuarioNaoAutenticado();
        }
    }
}
