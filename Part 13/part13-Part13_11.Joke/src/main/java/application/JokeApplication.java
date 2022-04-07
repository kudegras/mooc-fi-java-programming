package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        // Menu for main layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(10, 10, 10, 10));
        menu.setSpacing(10);

        // Buttons
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        // Add buttons to menu
        menu.getChildren().addAll(joke, answer, explanation);

        layout.setTop(menu);

        // Create subview layouts
        StackPane jokeView = createView("What do you call a bear with no teeth?");
        StackPane answerView = createView("A gummy bear.");
        StackPane explanationView = createView("Get it because they only have gums? HAHAHA");

        // Add subview layouts to buttons
        joke.setOnAction((event) -> layout.setCenter(jokeView));
        answer.setOnAction((event) -> layout.setCenter(answerView));
        explanation.setOnAction((event) -> layout.setCenter(explanationView));

        // Set initial view
        layout.setCenter(jokeView);

        // Create main scene
        Scene scene = new Scene(layout);

        // Show the main scene
        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }
}
