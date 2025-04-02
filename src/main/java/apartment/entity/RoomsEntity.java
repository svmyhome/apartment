package apartment.entity;

import apartment.data.Rooms;

public class RoomsEntity {
    private int id;
    private Rooms roomName;

    public int getId() {
        return id;
    }

    public RoomsEntity setId(int id) {
        this.id = id;
        return this;
    }

    public Rooms getRoomName() {
        return roomName;
    }

    public RoomsEntity setRoomName(Rooms roomName) {
        this.roomName = roomName;
        return this;
    }
}
