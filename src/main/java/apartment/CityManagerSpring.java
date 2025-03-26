package apartment;

import apartment.domain.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.List;
import java.util.Map;

public class CityManagerSpring implements ICityManager {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public int createCity(City city) {
        return new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("city")
                .usingGeneratedKeyColumns("id")
                .executeAndReturnKey(Map.of(
                        "name", city.getName()
                )).intValue();
    }

    @Override
    public int deleteCity(int id) {
        return jdbcTemplate.update("DELETE FROM public.city WHERE id = ?", id);
    }

    // #TODO
    @Override
    public List<City> findByName(String name) {
        return List.of();
    }
}
