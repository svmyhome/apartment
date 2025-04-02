package apartment.db;

import apartment.entity.CityEntity;

import java.util.List;

public interface ICityManager {
    int createCity(CityEntity city);

    // #TODO
    int deleteCity(int id);

    List<CityEntity> findByName(String name);
}
