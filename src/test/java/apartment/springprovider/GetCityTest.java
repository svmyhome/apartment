package apartment.springprovider;

import apartment.CityManager;
import apartment.ICityManager;
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
