public class Book extends Item {
    final String isbn_no;
    String item_Id;
    final String author;
    final String genre;
    final String publication;

    Book(String title, String isbn_no, String item_Id, String author, String genre, String publication) {
        super(title);
        this.isbn_no = isbn_no;
        this.item_Id = item_Id;
        this.author = author;
        this.genre = genre;
        this.publication = publication;
    }

    //getters and setters
    public String getItem_Id(){
        return item_Id;
    }
    public void setItem_Id(){
        this.item_Id = item_Id;
    }

    //overriding equals method
    @Override
    public boolean equals(Object input) {
        if (this == input) {
            return true;
        }
        if (input == null) {
            return false;
        }
        if (!(input instanceof Book)) {
            String bookNo = ((Book) input).getItem_Id();
            if (bookNo != null && bookNo.equals(this.item_Id)) {
                return true;
            }
        }
        return false;
    }

    //overriding hashcode() method
    @Override
    public int hashCode() {
        return this.item_Id.hashCode();
    }

    //overriding toString method
    @Override
    public String toString() {
        return "Name: " + title + ", ISBN No: " + isbn_no + ", Item ID: " + item_Id
                + "Author: " + author + "Genre: " + genre + "Publication: " + publication;
    }
}