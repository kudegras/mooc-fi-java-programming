
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            } 
            System.out.print("Input the age recommendation: ");
            int inputAge = Integer.valueOf(scanner.nextLine());

            books.add(new Book(inputTitle, inputAge));
        }

        System.out.println("\n" + books.size() + " books in total.");

        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getTitle);

        Collections.sort(books, comparator);

        System.out.println("\nBooks:");
        books.stream().forEach(b -> System.out.println(b));
    }
}
