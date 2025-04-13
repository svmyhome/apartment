package apartment.db.repository;

import apartment.entity.RoomsEntity;
import java.util.List;

public interface RoomsRepository {
    int createRoom(RoomsEntity room);

    List<RoomsEntity> getAll();

    RoomsEntity getByName(String room);
}
