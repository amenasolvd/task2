package items;

public class Book extends Item {

    private final String isbnNo;
    private final String author;
    private final String genre;

    public Book( String isbnNo, String author, String genre, String title, int itemId, String publication ) {
        super(title, itemId, publication);
        this.isbnNo = isbnNo;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public int getItemId() {
        return super.getItemId();
    }

    @Override
    public String getPublication() {
        return super.getPublication();
    }

    @Override
    public void setPublication(String publication) {
        super.setPublication(publication);
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNo='" + isbnNo + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}