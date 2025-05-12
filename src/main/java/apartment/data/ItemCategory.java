package apartment.data;

import java.util.Arrays;


public enum ItemCategory {
    ELECTRONICS("Электроника"),
    FURNITURE("Мебель"),
    OTHER("Прочее");

    public String getDescription() {
        return description;
    }

    private final String description;

    ItemCategory(String description) {
        this.description = description;
    }

    public static ItemCategory findItemCategory(String description) {
        return Arrays.stream(values())
                .filter(itemCategory -> itemCategory.getDescription().equals(description))
                .findFirst().orElseThrow();
    }
}
