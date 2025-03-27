package apartment.data;

import java.util.Arrays;

public enum Rooms {
    CORNER("Коридор"),
    BATH("Сан узел"),
    BEDROOM("Спальня"),
    ROOM("Гостиная");

    public String getDescription() {
        return description;
    }

    private final String description;

    Rooms(String description) {
        this.description = description;
    }

    public static Rooms findRoom(String description) {
        return Arrays.stream(values())
                .filter(category -> category.getDescription().equals(description))
                .findFirst().orElseThrow();
    }
}
