package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TicTacToe ticTacToe = new TicTacToe();

        Font monoSpaced = Font.font("Monospaced", 40);

        Label gameStatus = new Label("Turn: " + ticTacToe.turn());
        gameStatus.setFont(monoSpaced);

        BorderPane layout = new BorderPane();
        layout.setTop(gameStatus);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Button btn = new Button(ticTacToe.status(x, y));
                btn.setFont(monoSpaced);

                grid.add(btn, x, y);

                int rx = x;
                int ry = y;

                btn.setOnAction((event) -> {
                    ticTacToe.place(rx, ry);
                    btn.setText(ticTacToe.status(rx, ry));
                    gameStatus.setText("Turn: " + ticTacToe.turn());

                    if (ticTacToe.ended()) {
                        gameStatus.setText("The end!");
                    }
                });
            }
        }

        layout.setCenter(grid);
        Scene scn = new Scene(layout);

        stage.setScene(scn);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}