package pattern.other;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Subscriber> subscribers=new ArrayList<Subscriber>();
	private String title;
	
	
	/* (non-Javadoc)
	 * @see pattern.other.Subject#subscribe(pattern.other.Subscriber)
	 */
	@Override
	public void subscribe(Subscriber sub) {
		subscribers.add(sub);
	}
	/* (non-Javadoc)
	 * @see pattern.other.Subject#unsubscribe(pattern.other.Observer)
	 */
	@Override
	public void unsubscribe(Observer sub) {
		subscribers.remove(sub);
	}
	
	/* (non-Javadoc)
	 * @see pattern.other.Subject#notifySubscribers()
	 */
	@Override
	public void notifySubscribers() {
		for(Observer s:subscribers) {
			s.update();
		}
	}
	
	/* (non-Javadoc)
	 * @see pattern.other.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title) {
		this.title=title;
	}

}
