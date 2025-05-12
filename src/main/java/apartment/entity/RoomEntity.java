package apartment.entity;

import apartment.data.Room;

public class RoomEntity {
    private int id;
    private Room roomName;

    public int getId() {
        return id;
    }

    public RoomEntity setId(int id) {
        this.id = id;
        return this;
    }

    public Room getRoomName() {
        return roomName;
    }

    public RoomEntity setRoomName(Room roomName) {
        this.roomName = roomName;
        return this;
    }
}
