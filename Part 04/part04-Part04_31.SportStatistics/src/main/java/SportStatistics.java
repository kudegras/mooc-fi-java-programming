
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int win = 0;
        int loose = 0;

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);

                if (line.contains(team)) {
                    i++;

                    if (team.equals(parts[0]) && score1 > score2) {
                        win++;
                    } else if (team.equals(parts[0]) && score1 < score2) {
                        loose++;
                    }

                    if (team.equals(parts[1]) && score1 < score2) {
                        win++;
                    } else if (team.equals(parts[1]) && score1 > score2){
                        loose++;
                    }

                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Games: " + i);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loose);

    }
}
