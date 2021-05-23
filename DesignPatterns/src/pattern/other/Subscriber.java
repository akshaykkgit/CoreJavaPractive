package pattern.other;

public class Subscriber implements Observer {
	private String name;
	private Subject channel;
	/* (non-Javadoc)
	 * @see pattern.other.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("hi "+this.name+" Video uploaded");
	}
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	

}
