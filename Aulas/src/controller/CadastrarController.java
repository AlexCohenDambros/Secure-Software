package controller;


import dao.CadastrarDAO;
import model.Usuario;
import view.CadastrarView;

public class CadastrarController {
    private CadastrarView cview;
    private Usuario usuario;
    private CadastrarDAO cdao;

    public CadastrarController() {

        cview = new CadastrarView();
        usuario = cview.insertUser(new Usuario());

        cdao = new CadastrarDAO();
        if (cdao.insertUser(usuario)) {
            cview.usuarioCadastrado();
        } else {
            cview.usuarioNaoCadastrado();
        }
    }
}
