package view;

import java.util.Scanner;

public class MenuView {
    Scanner sc;

    public MenuView() {
        this.sc = new Scanner(System.in);
    }

    public int escolhaMenu(){
        System.out.println("========== MENU ==========" + "\n" + "1 - Cadastrar usuario" + "\n" + "2 - Listar Usuarios" + "\n" + "9 - Sair" + "\n" + "Digite uma opcao: ");
        return sc.nextInt();
    }

}
