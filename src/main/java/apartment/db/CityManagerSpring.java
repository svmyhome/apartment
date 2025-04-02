package apartment.db;

import apartment.entity.CityEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.List;
import java.util.Map;

public class CityManagerSpring implements CityRepository {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public int createCity(CityEntity city) {
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

    //TODo
    @Override
    public List<CityEntity> getAll() {
        return List.of();
    }

    // #TODO
    @Override
    public List<CityEntity> getByName(String name) {
        return List.of();
    }
}
