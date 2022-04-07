package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        Label nameText = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button startButton = new Button("Start");

        GridPane layout = new GridPane();

        layout.add(nameText, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(startButton, 0, 2);

        // Make it stylish 💅 and drippy 💧
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene startView = new Scene(layout);

        // 2nd view, the welcome screen
        Label welcomeText = new Label();

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        // Event listeners
        startButton.setOnAction(event -> {
            welcomeText.setText("Welcome " + textField.getText() + "!");
            window.setScene(welcomeView);
        });

        window.setScene(startView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
        System.out.println("Hellow world! :3");
    }
}
