package apartment.data;

import java.util.Arrays;

public enum Rooms {
    CORRIDOR("Коридор"),
    BATHROOM("Сан узел"),
    BEDROOM("Спальня"),
    HALL("Прихожая"),
    KITCHEN("Кухня"),
    BALCONY("Балкон"),
    LIVING_ROOM("Гостиная");

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
