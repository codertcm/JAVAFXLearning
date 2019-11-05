package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PaneNest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.getChildren().add(new Circle(100, 100, 10));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(new Circle(200, 200, 10));

        HBox hBox = new HBox();
        hBox.getChildren().addAll(pane, stackPane);
        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
