public class LogSubscriber implements Subscriber {
    private String log;

    public LogSubscriber(String log) {
        this.log = log;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file);


    }
}
