package items;

public class Newspaper extends Item {

    private int publishedDate;

    public Newspaper(int publishedDate, String title, int itemId, String publication){
        super(title, itemId, publication);
        this.publishedDate =publishedDate;
    }

    public int getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(int publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publishedDate=" + publishedDate +
                "} " + super.toString();
    }
}