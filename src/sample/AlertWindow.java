package sample;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;

public class AlertWindow {

    public static boolean ans;

    public static boolean display(String title, String mg){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Label label = new Label();
        label.setText(mg);
        Button buttonY = new Button("yes");
        Button buttonN = new Button("no");

        buttonY.setOnMouseClicked(event -> {
            ans = true;
            stage.close();
        });
        buttonN.setOnMouseClicked(event -> {
            ans = false;
            stage.close();
        });
        HBox hBox = new HBox();
        hBox.getChildren().addAll(label, buttonY, buttonN);
        hBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hBox, 400, 400);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.showAndWait();

        return ans;
    }

}
