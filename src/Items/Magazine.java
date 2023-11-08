package Items;

import java.util.Objects;
public class Magazine extends Item implements IMagazine {
    private String itemId;
    private String publication;
    private String category;

    public Magazine(String title, String itemId, String publication, String category) {

        super(title);
        this.itemId = itemId;
        this.publication = publication;
        this.category = category;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle() {

    }

    public String getItemId() {
        this.itemId = itemId;
        return itemId;
    }

    public void setItemId() {

        return;
    }

    public String getPublication() {
        this.publication = publication;
        return publication;
    }

    public void setPublication() {

        return;
    }

    public String getCategory() {
        this.category = category;
        return category;
    }

    public void setCategory() {

        return;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine magazine)) return false;
        return Objects.equals(getItemId(), magazine.getItemId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemId());
    }

    //overriding toString method for magazine info
    @Override
    public String toString() {
        return "Items.Magazine{" +
                "item_Id='" + itemId + '\'' +
                ", publication='" + publication + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}