package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;

public class PartiesApplication extends Application {
    
    @Override
    public void start(Stage stage) {
        List<String[]> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("partiesdata.tsv")).map(line -> line.split("\t")).forEach(line -> rows.add(line));
        } catch (IOException e) {
            System.err.println("Failed to read the file \"partiesdata.tsv\".");
            return;
        }

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);

            XYChart.Series data = new XYChart.Series();
            data.setName(row[0]);

            for (int column = 1; column < row.length; column++) {
                String value = row[column];
                if (value.equals("-")) {
                    continue;
                }

                int year = Integer.parseInt(rows.get(0)[column]);
                data.getData().add(new XYChart.Data(year, Double.parseDouble(value)));
            }

            lineChart.getData().add(data);
        }

        Scene view = new Scene(lineChart, 400, 300);
        stage.setScene(view);
        stage.show();
    }
    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }
}
