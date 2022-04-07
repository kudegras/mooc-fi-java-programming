
import java.util.Collections;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<LiteracyRate> lr = readLitRate("literacy.csv");
        lr.stream().forEach(l -> System.out.println(l));

    }

    public static ArrayList<LiteracyRate> readLitRate(String file) {
        ArrayList<LiteracyRate> litRates = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(r -> r.split(","))
                    .map(p -> new LiteracyRate(p[3], Integer.valueOf(p[4]), p[2].replace("(%)", "")
                            .trim(), Double.valueOf(p[5])))
                    .forEach(l -> litRates.add(l));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Collections.sort(litRates, (l1, l2) -> Double.compare(l1.getLitRate(), l2.getLitRate()));
        return litRates;
    }

    // easy way
    /*
     * public static void main(String[] args) {
     * 
     * try {
     * 
     * Files.lines(Paths.get("literacy.csv"))
     * .map(x -> x.split(","))
     * .sorted((x, y) -> x[5].compareTo(y[5]))
     * .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " +
     * row[2].split(" ")[1].trim() + ", " + row[5]));
     * 
     * } catch (IOException error) {
     * 
     * System.out.println("There was an issue reading the file " +
     * error.getMessage());
     * }
     * 
     * }
     */
}
