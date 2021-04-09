package pattern.creationalPatten.factoryMehodPattern.Example2;

public class NotificationFactory {
	
	public Notification createNotification(String channel)
	{
		
		if(channel == null  || channel.isEmpty()) {
			return null;
		}
		else if ("SMS".equals(channel)) {
            return new SMSNotification();
        }
        else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        }
        else {
        	
		  return null;
        }
		
		
	}

}
