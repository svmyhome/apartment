package apartment.db.impl;

import apartment.db.repository.RoomRepository;
import apartment.entity.RoomEntity;
import java.util.List;

public class RoomRepositoryPostgres implements RoomRepository {
    @Override
    public int createRoom(RoomEntity room) {
        return 0;
    }

    @Override
    public List<RoomEntity> getAll() {
        return List.of();
    }

    @Override
    public RoomEntity getByName(String room) {
        return null;
    }
}
