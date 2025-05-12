package apartment.db.repository;

import apartment.entity.RoomEntity;
import java.util.List;

public interface RoomsRepository {
    int createRoom(RoomEntity room);

    List<RoomEntity> getAll();

    RoomEntity getByName(String room);
}
