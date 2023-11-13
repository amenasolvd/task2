package items;

import java.util.Objects;

public class Magazine extends Item {

    private String category;

    public Magazine(String category, String title, int itemId, String publication) {
        super(title, itemId, publication);
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

    public void setCategory(String category) {
        this.category = category;
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
        return "Magazine{" +
                "category='" + category + '\'' +
                "} " + super.toString();
    }
}