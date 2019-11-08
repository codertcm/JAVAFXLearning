package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class multiNodeMultiEventHandler extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static myHandler[][] handlers = new myHandler[6][6];

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        Circle[][] circles = new Circle[6][6];


        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                circles[i][j] = new Circle(i * 100 + 50, j * 100 + 50, 45 );
                circles[i][j].setFill(new Color(1,1,1,0));
                circles[i][j].setStroke(Color.BLACK);
                handlers[i][j] = new myHandler(i, j);
                circles[i][j].setOnMousePressed(handlers[i][j]);
                pane.getChildren().add(circles[i][j]);
            }
        }
        Scene scene = new Scene(pane, 700, 700);
        stage.setScene(scene);
        stage.show();
    }
}

class myHandler implements EventHandler<MouseEvent> {

    private int x;
    private int y;

    @Override
    public void handle(MouseEvent mouseEvent) {
        System.out.printf("the circle position is (%d,%d)\n", x, y);
    }

    myHandler(int _x, int _y){
        x = _x;
        y = _y;
    }
}
