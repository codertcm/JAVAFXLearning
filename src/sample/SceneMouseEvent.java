package sample;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class SceneMouseEvent implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent event) {
        System.out.println("Scene Hello");
    }
}
