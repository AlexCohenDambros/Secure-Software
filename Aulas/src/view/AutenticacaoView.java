package view;

import controller.MenuController;
import model.Usuario;

import java.util.Scanner;

public class AutenticacaoView {

    Scanner sc;

    public AutenticacaoView() {
        this.sc = new Scanner(System.in);
    }

    public Usuario login(Usuario usuario) {
        System.out.print("E-mail: ");
        usuario.setEmail(sc.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(sc.next());

        return usuario;
    }

    public void usuarioAutenticado() {
        System.out.println("\nUsuario Autenticado");
        new MenuController();
    }

    public void usuarioNaoAutenticado() {
        System.out.println("\nUsuario Nao Autenticado");
    }


}
