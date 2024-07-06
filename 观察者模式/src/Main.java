// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.publisher.subscribe("open", new EmailSubscriber("/path/to/log/file.txt"));
        editor.publisher.subscribe("open", new EmailSubscriber("/path/to/log/file2.txt"));
        editor.publisher.subscribe("save", new LogSubscriber("admin@example.com"));

        try {
            editor.open("test.txt");
            editor.save("test.s");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}