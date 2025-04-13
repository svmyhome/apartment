package apartment.db.repository;

import apartment.entity.ApartmentAddressEntity;
import apartment.entity.ApartmentStuffEntity;
import java.util.List;

public interface ApartmentStuffRepository {

    List<ApartmentStuffEntity> getAll();
    List<ApartmentAddressEntity> getFlatId(int id);
}
