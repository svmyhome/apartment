package apartment.db.impl;

import apartment.db.repository.ApartmentAddressRepository;
import apartment.entity.ApartmentAddressEntity;
import java.util.List;

public class ApartmentAddressRepositoryManagerPostgres implements ApartmentAddressRepository {
    @Override
    public int createAddress(String address) {
        return 0;
    }

    @Override
    public int deleteAddress(int id) {
        return 0;
    }

    @Override
    public List<ApartmentAddressEntity> getAll() {
        return List.of();
    }

    @Override
    public List<ApartmentAddressEntity> getByStreet(String name) {
        return List.of();
    }
}
