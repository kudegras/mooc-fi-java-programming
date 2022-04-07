
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int i = 1;
        for (String list: this.todoList) {
            System.out.println(i + ": " + list);
            i++;
        }
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}
