public class Newspaper extends Item {
    final int published_date;
    Newspaper(String title,int published_date){
        super(title);
        this.published_date =published_date;
    }
}