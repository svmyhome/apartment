package apartment.entity;

import apartment.data.ItemCategory;

public class CategoryEntity {
    private int id;
    private ItemCategory category;

    public ItemCategory getCategory() {
        return category;
    }

    public CategoryEntity setCategory(ItemCategory category) {
        this.category = category;
        return this;
    }

    public int getId() {
        return id;
    }

    public CategoryEntity setId(int id) {
        this.id = id;
        return this;
    }


}
