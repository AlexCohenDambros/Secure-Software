package view;

import controller.MenuController;
import model.Usuario;

import java.util.LinkedList;
import java.util.List;

public class ListarView {

    public void listUsuarios(List<Usuario> lista) {
        for (Usuario usuario : lista
        ) {
            System.out.println(usuario.getEmail());
        }
    }

    public void usuarioNaoEcontrado() {
        System.out.println("\nNenhum usuário foi encontrado!");
    }

}
