package apartment.entity;

public class ItemsEntity {
    private int id;
    private int categoryId;
    private String itemName;

    public int getId() {
        return id;
    }

    public ItemsEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public ItemsEntity setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public ItemsEntity setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
}
