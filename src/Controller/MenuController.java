package Controller;

import Model.Menu;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MenuController extends SubKeyController {
    Menu menu;
    public MenuController(Menu menu) {
        super();
        this.menu = menu;
    }

    @Override
    void keyInput(KeyCode code) {
        switch(code) {
            case ESCAPE:
                menu.Escape();
                break;
            case UP:
                menu.Up();
                break;
            case DOWN:
                menu.Down();
                break;
        }
    }


    /*
    public void handle(KeyEvent event) {


        switch(event.getCode()) {
            case ESCAPE:
                menu.Escape();
                System.out.println("JFEIOJFWOJ");
                break;
            case UP:
                menu.Up();
                break;
            case DOWN:
                menu.Down();
                break;
        }
    } */
}
