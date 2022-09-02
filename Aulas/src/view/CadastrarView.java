package view;

import controller.MenuController;
import model.Usuario;

import java.util.Scanner;

public class CadastrarView {
    Scanner sc;

    public CadastrarView() {
        this.sc = new Scanner(System.in);
    }

    public Usuario insertUser(Usuario usuario) {
        System.out.print("Digite o E-mail: ");
        usuario.setEmail(sc.nextLine());

        System.out.print("Digite a Senha: ");
        usuario.setSenha(sc.next());

        return usuario;
    }

    public void usuarioCadastrado() {
        System.out.println("\nUsuario Cadastrado");
        MenuController menu = new MenuController();
    }

    public void usuarioNaoCadastrado() {
        System.out.println("\nUsuario Nao foi cadastrado");
    }
}
