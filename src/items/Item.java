package items;

public class Item {

    private String itemId;
    private String title;
    private String genre;
    private String publication;

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}