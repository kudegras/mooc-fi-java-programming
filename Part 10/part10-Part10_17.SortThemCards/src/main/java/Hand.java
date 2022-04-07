
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream().forEach(c -> System.out.println(c));
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand h) {
        int thisValue = cards.stream()
                .map(c -> c.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = h.cards.stream()
                .map(c -> c.getValue())
                .reduce(0, (a, b) -> a + b);
        
        return thisValue - otherValue;
    }
}
