package apartment;

import apartment.db.impl.old.CityManager;
import apartment.db.repository.CityRepository;
import apartment.entity.CityEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCityTest {
    CityRepository cm = new CityManager();
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
