package items;

import java.util.Objects;

public class Magazine extends Item {

    private int itemId;
    private String publication;
    private String category;

    public Magazine(String title, int itemId, String publication, String category) {
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
    public void setTitle(String title) {
        super.setTitle(title);
    }

    public int getItemId() {
        this.itemId = itemId;
        return itemId;
    }

    public String getPublication() {
        this.publication = publication;
        return publication;
    }

    public void setPublication() {
    }

    public String getCategory() {
        this.category = category;
        return category;
    }

    public void setCategory() {
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

    @Override
    public String toString() {
        return "items.Magazine{" +
                "item_Id='" + itemId + '\'' +
                ", publication='" + publication + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}