package apartment.db.repository;

import apartment.entity.AccountEntity;
import apartment.entity.ApartmentAddressAndCityEntity;
import apartment.entity.ApartmentAddressEntity;
import apartment.entity.SpendEntity;
import java.util.List;

public interface ApartmentAddressRepository {

    int createAddress(String address, String street, String house, String flat, AccountEntity account);

    // #TODO
    int deleteAddress(int id);

    List<ApartmentAddressEntity> getAllForAccount(AccountEntity account);

    List<ApartmentAddressAndCityEntity> showAllCitiesForUser111(AccountEntity account);

    List<ApartmentAddressEntity> getAll();

    List<ApartmentAddressEntity> getByStreet(String name);
}
