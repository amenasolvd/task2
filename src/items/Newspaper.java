package items;

public class Newspaper extends Item {

    private int publishedDate;

    public Newspaper(String title,int publishedDate){
        super(title);
        this.publishedDate =publishedDate;
    }

    public int getPublishedDate() {
        this.publishedDate = publishedDate;
        return publishedDate;
    }

    public void setPublishedDate() {
    }

    public Newspaper(String title) {
        super(title);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }
}