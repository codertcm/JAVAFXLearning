package sample;


import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class MyMouseEvent implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent event) {
        System.out.println("Hello mouse");
    }
}
