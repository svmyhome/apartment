package apartment.entity;

public class ItemEntity {
    private int id;
    private int categoryId;
    private String itemName;

    public int getId() {
        return id;
    }

    public ItemEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public ItemEntity setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public ItemEntity setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
}
