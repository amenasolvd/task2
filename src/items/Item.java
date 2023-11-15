package items;

import java.util.Objects;

public class Item {

    private int itemId;
    private String title;
    private String publication;

    public Item(String title, int itemId, String publication) {
        this.title = title;
        itemId = (int) (Math.random() + 1000);
        this.itemId =itemId;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return getItemId() == item.getItemId() && Objects.equals(getTitle(), item.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemId(), getTitle());
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", title='" + title + '\'' +
                ", publication='" + publication + '\'' +
                '}';
    }
}