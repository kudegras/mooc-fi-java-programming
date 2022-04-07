
import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        return this.room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person shortest = this.room.get(0);

        for (Person prs: room) {
            if (shortest.getHeight() > prs.getHeight()) {
                shortest = prs;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person shortest = shortest();

        room.remove(shortest());
        
        return shortest;
    }
}
