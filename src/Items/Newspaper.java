package Items;

public class Newspaper extends Item {

    final int publishedDate;

    public Newspaper(String title,int publishedDate){

        super(title);
        this.publishedDate =publishedDate;
    }
}