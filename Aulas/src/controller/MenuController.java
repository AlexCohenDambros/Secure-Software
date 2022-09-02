package controller;

import dao.CadastrarUser;
import model.Usuario;
import view.MenuView;

public class MenuController {
    private MenuView menuview;

    public MenuController() {
        menuview = new MenuView();
        switch (menuview.escolhaMenu()){
            case 1:
                System.out.println("entro no cadastrar ");
                CadastrarUser insert = new CadastrarUser(new Usuario());
                break;
            case 2:
                System.out.println("Listar Usuarios  ");
                break;
            case 9:
                System.out.println("Saiu do menu!");
                break;
        }

    }

}
