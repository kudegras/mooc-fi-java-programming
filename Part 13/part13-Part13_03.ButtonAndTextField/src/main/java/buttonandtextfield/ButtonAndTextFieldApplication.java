package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) {
        Button butt = new Button("butt lol");
        TextField tf = new TextField();

        FlowPane group = new FlowPane();
        group.getChildren().add(butt);
        group.getChildren().add(tf);

        Scene view = new Scene(group);

        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }

}
