package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    Button button1, button2;
    Scene scene1, scene2;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        stage.setOnCloseRequest(event -> {
            event.consume();
            closeFunction();
        });
        Button button = new Button();
        button.setText("next");
        button.setOnMouseClicked(event ->{
            closeFunction();
        });
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }

    private void closeFunction() {
        if(AlertWindow.display("new Window", "is close")){
            stage.close();
        }
    }


    public static void main(String[] args) {

        launch(args);
    }


}
