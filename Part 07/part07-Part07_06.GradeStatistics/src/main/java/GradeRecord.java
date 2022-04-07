
import java.util.ArrayList;

public class GradeRecord {
    private ArrayList<Integer> grades;
  
    public GradeRecord() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int input) {
        if (input >= 0 && input <= 100) {
            this.grades.add(input);
        }
    }

    public String getAverage() {
        int sum = 0;
        for (Integer grade: grades) {
            sum += grade;
        }
        double average = 1.0 * sum / this.grades.size();
        return average + "";
    }

    public String getAveragePassing() {
        int sum = 0;
        int counter = 0;
        for (Integer grade: grades) {
            if (grade >= 50) {
                sum += grade;
                counter++;
            }
        }
        double average = 1.0 * sum / counter;
        if (sum == 0) {
            return "-";
        } else {
            return average + "";
        }
    }

    public String getPassPercentage() {
        int passing = 0;
        for (Integer grade: grades) {
            if (grade >= 50) {
                passing++;
            }
        }
        double passPercentage = 100.0 * passing / this.grades.size();
        return passPercentage + "";
    }

    public void printGradeDistribution() {
        int[] gradeDist = new int[6];
        for (Integer grade: this.grades) {
            if (grade >= 90) {
                gradeDist[0]++;
            } else if (grade <= 89 && grade > 79) {
                gradeDist[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDist[2]++; 
            } else if (grade <= 69 && grade > 59) {
                gradeDist[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDist[4]++;
            } else {
                gradeDist[5]++;
            }
        }

        System.out.println("Grade Distribution: ");
        int grade = 5;
        for (int grDist: gradeDist) {
            System.out.print(grade + ":");

            for (int i = 0; i < grDist; i++) {
                System.out.print("*");
            }

            System.out.println("");
            grade--;
        }
    }

    public void prinGrades() {
        System.out.println("Point average (all): " + this.getAverage());
        System.out.println("Point average (passing): " + this.getAveragePassing());
        System.out.println("Pass percentage: " + this.getPassPercentage());
        printGradeDistribution();
    }
}
