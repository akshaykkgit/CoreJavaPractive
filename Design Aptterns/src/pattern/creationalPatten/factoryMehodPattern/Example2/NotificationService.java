package pattern.creationalPatten.factoryMehodPattern.Example2;

public class NotificationService {
	
	public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.nofifyUser();
    }

}
