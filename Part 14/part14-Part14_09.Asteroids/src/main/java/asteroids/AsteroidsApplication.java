package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    public static int WIDTH = 600;
    public static int HEIGHT = 500;

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        Text text = new Text(10, 20, "Points: 0");
        Text gameOverText = new Text(WIDTH / 2, HEIGHT / 2, "");
        pane.getChildren().addAll(text, gameOverText);

        AtomicInteger points = new AtomicInteger();

        AudioClip laser = new AudioClip("file:laser.wav");
        AudioClip explosion = new AudioClip("file:explosion.wav");
        AudioClip end = new AudioClip("file:end.wav");

        Ship ship = new Ship(WIDTH / 2, HEIGHT / 2);
        List<Character> asteroids = new ArrayList<>();
        List<Character> projectiles = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            Asteroid asteroid = new Asteroid(rnd.nextInt(100), rnd.nextInt(100));
            asteroids.add(asteroid);
        }

        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));

        Scene scene = new Scene(pane);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        scene.setOnKeyPressed((event) -> pressedKeys.put(event.getCode(), Boolean.TRUE));
        scene.setOnKeyReleased((event) -> pressedKeys.put(event.getCode(), Boolean.FALSE));

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }

                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }

                if (pressedKeys.getOrDefault(KeyCode.SPACE, false && projectiles.size() < 3)) {
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(),
                            (int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);

                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    pane.getChildren().add(projectile.getCharacter());

                    laser.play();
                }

                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());

                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (projectile.collide(asteroid)) {
                            explosion.play();
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                        }
                    });

                    if (!projectile.isAlive()) {
                        text.setText("Points: " + points.addAndGet(1000));
                    }
                });

                destroy(projectiles);
                destroy(asteroids);

                asteroids.forEach(asteroid -> {
                    if (ship.collide(asteroid)) {
                        end.play();
                        gameOverText.setText("PATAY!");
                        stop();
                    }
                });

                if (Math.random() < 0.05) {
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if (!asteroid.collide(ship)) {
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }
            }

            public void destroy(List<Character> characters) {
                characters.stream()
                        .filter(character -> !character.isAlive())
                        .forEach(character -> pane.getChildren().remove(character.getCharacter()));
                characters.removeAll(characters.stream()
                        .filter(character -> !character.isAlive())
                        .collect(Collectors.toList()));
            }

        }.start();

        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("Hello, world!");
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }
}
