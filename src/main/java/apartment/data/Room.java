package apartment.data;

import java.util.Arrays;

public enum Room {
    CORRIDOR("Коридор"),
    BATHROOM("Сан узел"),
    BEDROOM("Спальня"),
    HALL("Прихожая"),
    KITCHEN("Кухня"),
    BALCONY("Балкон"),
    LIVING_ROOM("Гостиная");

    private final String description;

    Room(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Room findRoom(String description) {
        return Arrays.stream(values())
                .filter(room -> room.getDescription().equals(description))
                .findFirst().orElseThrow();
    }
}
