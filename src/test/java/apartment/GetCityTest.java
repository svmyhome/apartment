package apartment;

import apartment.db.CityManager;
import apartment.db.ICityManager;
import apartment.entity.CityEntity;
import org.junit.jupiter.api.Test;

import java.util.List;


public class GetCityTest {

    private ICityManager cm = new CityManager();

    @Test
    void getCityTest() {

        List<CityEntity> actualResult = cm.findByName("Вологда");
        actualResult.forEach(System.out::println);
    }
}
