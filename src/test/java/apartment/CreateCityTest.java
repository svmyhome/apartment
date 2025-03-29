package apartment;

import apartment.db.CityManager;
import apartment.db.ICityManager;
import apartment.entity.CityEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCityTest {
    ICityManager cm = new CityManager();
    private int createdCityId;

    @BeforeEach
    void addCity() {
        createdCityId = cm.createCity(CityEntity.builder()
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
