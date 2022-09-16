package view;

import java.util.Scanner;

public class MenuView {
    Scanner sc;

    public MenuView() {
        this.sc = new Scanner(System.in);
    }

    public int escolhaMenu(){
        System.out.println("""
                ========== MENU ==========
                1 - Cadastrar usuario
                2 - Listar Usuarios
                9 - Sair
                Digite uma opcao:\s""");
        return sc.nextInt();
    }
}