public class Main {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();


        Subscriber subscriber1 = new NewsSubscriber("Leo");
        Subscriber subscriber2 = new NewsSubscriber("Gabriel");
        Subscriber subscriber3 = new NewsSubscriber("Harvey");
        Subscriber subscriber4= new NewsSubscriber("Daj");
        Subscriber subscriber5 = new NewsSubscriber("jay");

        agency.subscribe(subscriber1);
        agency.subscribe(subscriber2);
        agency.subscribe(subscriber3);
        agency.subscribe(subscriber4);
        agency.subscribe(subscriber5);


        agency.publishNews("Breaking news:  Observer Pattern Implemented!");


        agency.unsubscribe(subscriber1);
        agency.unsubscribe(subscriber3);
        agency.unsubscribe(subscriber5);



        agency.publishNews("Another news: Dynamic Subscription Updated");
    }
}
