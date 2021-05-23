package pattern.other;

public class Youtube {

	public static void main(String[] args) {
		
		Subject channel=new Channel();
		Subscriber s1=new Subscriber("Akshay");
		Subscriber s2=new Subscriber("Arun");
		Subscriber s3=new Subscriber("Shilpa");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		
		channel.upload("Video 1");
		
		channel.notifySubscribers();
		channel.unsubscribe(s3);
		System.out.println();
		
		
		channel.notifySubscribers();
		
		
		
		

	}

}
