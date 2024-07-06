public class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file);
    }
}


