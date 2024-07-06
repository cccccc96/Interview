//import java.util.EventListener;
import java.util.*;
public class Publisher {
    Map<String, List<Subscriber>> listeners = new HashMap<>();

    public Publisher(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Subscriber listener) {
        List<Subscriber> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Subscriber listener) {
        List<Subscriber> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String file) {
        List<Subscriber> users = listeners.get(eventType);
        for (Subscriber listener : users) {
            listener.update(eventType, file);
        }
    }
}

