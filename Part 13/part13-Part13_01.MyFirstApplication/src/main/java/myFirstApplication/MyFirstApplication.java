package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My first application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
        System.out.println("Hello world!");
    }

}
