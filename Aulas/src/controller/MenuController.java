package controller;

import view.MenuView;

public class MenuController {

    public MenuController() {
        MenuView menuview = new MenuView();
        switch (menuview.escolhaMenu()) {
            case 1 -> {
                System.out.println("\nInformacoes para cadastro:");
                new CadastrarController();
            }
            case 2 -> {
                System.out.println("Listar Usuarios  ");
                new ListarController();
            }
            case 9 -> System.out.println("Saiu do menu!");
        }

    }

}
