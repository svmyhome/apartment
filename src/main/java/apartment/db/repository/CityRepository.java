package apartment.db.repository;

import apartment.entity.CityEntity;
import java.util.List;

public interface CityRepository {

    int addCity(CityEntity city);

    // #TODO
    int deleteCity(int id);

    List<CityEntity> getAllCity();

    CityEntity getByName(String name);
}
