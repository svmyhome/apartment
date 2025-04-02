package apartment.db;

import apartment.entity.CityEntity;

import java.util.List;

public interface CityRepository {

    int createCity(CityEntity city);

    // #TODO
    int deleteCity(int id);

    List<CityEntity> getAll();
    List<CityEntity> getByName(String name);
}
