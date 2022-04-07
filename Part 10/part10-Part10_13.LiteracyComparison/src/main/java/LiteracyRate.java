
public class LiteracyRate {
    private String country;
    private int year;
    private String gender;
    private double litRate;

    public LiteracyRate(String country, int year, String gender, double litRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.litRate = litRate;
    }

    public double getLitRate() {
        return litRate;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + litRate;
    }
}
