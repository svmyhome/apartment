package apartment.entity;

public class ApartmentStuffEntity {
    private int id;
    private int flatId;
    private int roomId;
    private int itemId;

    public int getId() {
        return id;
    }

    public ApartmentStuffEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getFlatId() {
        return flatId;
    }

    public ApartmentStuffEntity setFlatId(int flatId) {
        this.flatId = flatId;
        return this;
    }

    public int getRoomId() {
        return roomId;
    }

    public ApartmentStuffEntity setRoomId(int roomId) {
        this.roomId = roomId;
        return this;
    }

    public int getItemId() {
        return itemId;
    }

    public ApartmentStuffEntity setItemId(int itemId) {
        this.itemId = itemId;
        return this;
    }
}
