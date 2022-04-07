package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

        AudioClip sound = new AudioClip("file:Applause-Yannick_Lemieux.wav");
        nappi.setOnAction((event) -> sound.play());

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(HurraaSovellus.class);
    }

}
