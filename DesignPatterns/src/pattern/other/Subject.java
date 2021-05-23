package pattern.other;

public interface Subject {

	void subscribe(Subscriber sub);

	void unsubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}