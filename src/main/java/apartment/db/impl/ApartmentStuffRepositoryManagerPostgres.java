package apartment.db.impl;

import apartment.db.repository.ApartmentStuffRepository;
import apartment.entity.ApartmentAddressEntity;
import apartment.entity.ApartmentStuffEntity;
import java.util.List;

public class ApartmentStuffRepositoryManagerPostgres implements ApartmentStuffRepository {
    @Override
    public List<ApartmentStuffEntity> getAll() {
        return List.of();
    }

    @Override
    public List<ApartmentAddressEntity> getFlatId(int id) {
        return List.of();
    }
}
