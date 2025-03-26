package apartment;

import apartment.domain.City;

import java.util.List;

public interface ICityManager {
    int createCity(City city);

    int deleteCity(int id);

    List<City> findByName(String name);
}
