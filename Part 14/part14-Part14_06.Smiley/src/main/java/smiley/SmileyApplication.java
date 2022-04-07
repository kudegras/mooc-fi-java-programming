package smiley;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Canvas drawingCanvas = new Canvas(400, 400);
        GraphicsContext drawer = drawingCanvas.getGraphicsContext2D();

        drawer.setFill(Color.WHITE);
        drawer.clearRect(0, 0, 640, 480);

        drawer.setFill(Color.BLACK);
        drawer.fillRect(100, 50, 50, 50);
        drawer.fillRect(250, 50, 50, 50);

        drawer.fillRect(100, 250, 200, 50);
        drawer.fillRect(50, 200, 50, 50);
        drawer.fillRect(300, 200, 50, 50);

        BorderPane layout = new BorderPane();
        layout.setCenter(drawingCanvas);
        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello world!");
    }

}
