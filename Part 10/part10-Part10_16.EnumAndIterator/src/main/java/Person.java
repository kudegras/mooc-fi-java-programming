
public class Person {
    private String name;
    private Education educ;
    
    public Person(String name, Education educ) {
        this.name = name;
        this.educ = educ;
    }

    public Education getEducation() {
        return educ;
    }

    @Override
    public String toString() {
        return name + ", " + educ;
    }
}
