import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }


    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }


    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void publishNews(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
