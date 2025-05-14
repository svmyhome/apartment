package apartment.db.repository;

import apartment.entity.AccountEntity;
import apartment.entity.ApartmentAddressEntity;
import apartment.entity.SpendEntity;
import java.util.List;

public interface ApartmentAddressRepository {

    int createAddress(String address);

    // #TODO
    int deleteAddress(int id);

    List<ApartmentAddressEntity> getAllForAccount(AccountEntity account);

    List<ApartmentAddressEntity> getAll();

    List<ApartmentAddressEntity> getByStreet(String name);
}
