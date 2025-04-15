package apartment.db.impl;

import apartment.db.repository.RoomsRepository;
import apartment.entity.RoomsEntity;
import java.util.List;

public class RoomsRepositoryManagerPostgres implements RoomsRepository {
    @Override
    public int createRoom(RoomsEntity room) {
        return 0;
    }

    @Override
    public List<RoomsEntity> getAll() {
        return List.of();
    }

    @Override
    public RoomsEntity getByName(String room) {
        return null;
    }
}
