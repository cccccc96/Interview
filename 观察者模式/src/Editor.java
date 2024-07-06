public class Editor {
    public Publisher publisher;
    private String file;
    public Editor(){
        this.publisher = new Publisher("open", "save");
    }

    public void open(String filepath){
        file = filepath;
        publisher.notify("open",file);
    }

    public void save(String filepath){
        file = filepath;
        publisher.notify("save",file);
    }
}
