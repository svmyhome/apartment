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

    public static ItemCategory findCategory(String description) {
        return Arrays.stream(values())
                .filter(category -> category.getDescription().equals(description))
                .findFirst().orElseThrow();
    }
}
