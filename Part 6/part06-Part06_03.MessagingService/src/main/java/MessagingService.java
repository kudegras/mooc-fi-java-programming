import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messaging;

    public MessagingService() {
        this.messaging = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messaging.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messaging;
    }
}
