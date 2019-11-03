package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EventDrivenProgrammingByAnonymousClass extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("I' am a button");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("button was clicked");
            }
        });
        Pane pane = new Pane();
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
