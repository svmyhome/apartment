package apartment.entity;

import apartment.data.ItemCategory;

public class ItemCategoryEntity {
    private int id;
    private ItemCategory category;

    public ItemCategory getCategory() {
        return category;
    }

    public ItemCategoryEntity setCategory(ItemCategory category) {
        this.category = category;
        return this;
    }

    public int getId() {
        return id;
    }

    public ItemCategoryEntity setId(int id) {
        this.id = id;
        return this;
    }


}
