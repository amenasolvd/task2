package items;

public class Book extends Item {

    private final String isbnNo;
    private final int itemId;
    private final String author;
    private final String genre;
    private final String publication;

    public Book(String title, String isbnNo, int itemId, String author, String genre, String publication) {
    super(title);
    this.isbnNo = isbnNo;
    this.itemId = itemId;
    this.author = author;
    this.genre = genre;
    this.publication = publication;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public void setTitle() { }

    public String getIsbnNo() {
        return isbnNo;
    }

    public int getItemId() {
        return itemId;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublication() {
        return publication;
    }

    @Override
    public boolean equals(Object input) {
        if (this == input) {
            return true;
        }
        if (input == null) {
            return false;
        }
        if (!(input instanceof Book)) {
            int bookNo = ((Book) input).itemId;
            if (bookNo != 0 && bookNo == this.itemId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.itemId;
    }

    @Override
    public String toString() {
        return "Name: " + getTitle() + ", ISBN No: " + isbnNo + ", Item ID: " + itemId
                + "Author: " + author + "Genre: " + genre + "Publication: " + publication;
    }
}