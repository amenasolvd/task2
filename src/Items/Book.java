package Items;

public class Book extends Item implements IBook {
    private final String isbnNo;
    private String itemId;
    private final String author;
    private final String genre;
    private final String publication;

    public Book (String title, String isbnNo, String itemId, String author, String genre, String publication) {

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
    public void setTitle(){
       return;
    }

    public String getItemId() {
        this.itemId = itemId;
        return itemId;
    }

    public void setItemId(){

        this.itemId = itemId;
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
            String bookNo = ((Book) input).getItemId();
            if (bookNo != null && bookNo.equals(this.itemId)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {

        return this.itemId.hashCode();
    }

    @Override
    public String toString() {
        return "Name: " + getTitle()  + ", ISBN No: " + isbnNo + ", Item ID: " + itemId
                + "Author: " + author + "Genre: " + genre + "Publication: " + publication;
    }
}