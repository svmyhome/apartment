package apartment.springprovider;

import apartment.db.impl.CityManager;
import apartment.db.CityRepository;
import apartment.entity.CityEntity;
import org.junit.jupiter.api.Test;

import java.util.List;


public class GetCityTest {

    private CityRepository cm = new CityManager();

    @Test
    void getCityTest() {

        CityEntity actualResult = cm.getByName("Вологда");
        System.out.println(actualResult);
    }
}
