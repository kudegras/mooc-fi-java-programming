
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while (iterator.hasNext()) {
            this.persons.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education educ) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == educ) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education educ) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == educ) {
                iterator.remove();
            }
        }
    }
}
