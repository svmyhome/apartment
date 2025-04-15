package apartment.springprovider;

import apartment.db.impl.old.CityManager;
import apartment.db.repository.CityRepository;
import apartment.entity.CityEntity;
import org.junit.jupiter.api.Test;


public class GetCityTest {

    private CityRepository cm = new CityManager();

    @Test
    void getCityTest() {

        CityEntity actualResult = cm.getByName("Вологда");
        System.out.println(actualResult);
    }
}
