package apartment.db.repository;

import apartment.entity.AccountEntity;
import apartment.entity.ApartmentAddressEntity;
import apartment.entity.ApartmentStuffEntity;
import java.util.List;

public interface ApartmentStuffRepository {

    int createAddress(int flatId, int room, int item);

    List<ApartmentStuffEntity> getAll();

    List<ApartmentAddressEntity> getFlatId(int id);
}
