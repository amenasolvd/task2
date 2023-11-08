package Items;

public class Newspaper extends Item {

    private int publishedDate;

    public Newspaper(String title,int publishedDate){

        super(title);
        this.publishedDate =publishedDate;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle() {

    }

    public int getPublishedDate() {
        this.publishedDate = publishedDate;
        return publishedDate;
    }

    public void setPublishedDate() {
        return;
    }
}