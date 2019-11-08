package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circularRing extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        Circle circle1 = new Circle(50, 50, 40);

        Circle circle2 = new Circle(200, 50, 40);
        //circle2.setFill(new Color(1, 1, 1, 0));
        circle2.setFill(Color.valueOf("#ffffff00"));
        circle2.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle1, circle2);
        Scene scene = new Scene(pane, 500, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
