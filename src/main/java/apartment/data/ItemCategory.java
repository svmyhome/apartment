package apartment.data;

import java.util.Arrays;


// TODO RENAME
public enum ItemCategory {
    CORNER("Коридор"),
    BATH("Сан узел"),
    BEDROOM("Спальня"),
    ROOM("Гостиная");

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
