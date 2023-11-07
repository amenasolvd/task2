package Items;

import java.util.Objects;
public class Magazine extends Item {
    final String item_Id;
    final String publication;
    final String category;

    public Magazine(String title, String item_Id, String publication, String category) {

        super(title);
        this.item_Id = item_Id;
        this.publication = publication;
        this.category = category;
    }

    //getters and setters
    public String getItem_Id() {
        return item_Id;
    }

    public void setItem_Id() {
        return;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication() {
        return;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        return;
    }

    //overriding equals method for item_Id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine magazine)) return false;
        return Objects.equals(getItem_Id(), magazine.getItem_Id());
    }

    //overriding hashcode() for item_Id
    @Override
    public int hashCode() {
        return Objects.hash(getItem_Id());
    }

    //overriding toString method for magazine info
    @Override
    public String toString() {
        return "Items.Magazine{" +
                "item_Id='" + item_Id + '\'' +
                ", publication='" + publication + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}