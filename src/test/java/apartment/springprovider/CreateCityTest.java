package apartment.springprovider;

import apartment.db.impl.PostgresCityManagerRepository;
import apartment.db.CityRepository;
import apartment.entity.CityEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCityTest {
    CityRepository cm = new PostgresCityManagerRepository();
    private int createdCityId;

    @BeforeEach
    void addCity() {
        createdCityId = cm.addCity(CityEntity.builder()
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
