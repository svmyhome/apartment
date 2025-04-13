package apartment.db.repository;

import apartment.entity.ApartmentAddressEntity;
import java.util.List;

public interface ApartmentAddressRepository {

    int createAddress(String address);

    // #TODO
    int deleteAddress(int id);

    List<ApartmentAddressEntity> getAll();
    List<ApartmentAddressEntity> getByStreet(String name);
}
