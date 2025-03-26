package apartment.springprovider;

import apartment.CityManager;
import apartment.ICityManager;
import apartment.domain.City;
import org.junit.jupiter.api.Test;

import java.util.List;


public class GetCityTest {

    private ICityManager cm = new CityManager();

    @Test
    void getCityTest() {

        List<City> actualResult = cm.findByName("Вологда");
        actualResult.forEach(System.out::println);
    }
}
