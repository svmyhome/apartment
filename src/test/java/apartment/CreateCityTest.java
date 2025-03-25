package apartment;

import apartment.domain.City;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCityTest {
    CityManager cm = new CityManager();
    private int createdCityId;

    @BeforeEach
    void addCity() {
        createdCityId = cm.createCity(City.builder()
                .name("Иваново")
                .build());
    }
    @AfterEach
    void deleteCity() {
        cm.deleteCity(createdCityId);
    }

    @Test
    void createCityTest() {
        System.out.println(createdCityId);
    }
}
