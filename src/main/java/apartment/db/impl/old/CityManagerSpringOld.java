package apartment.db.impl.old;

import apartment.db.repository.CityRepository;
import apartment.db.DataSourceProvider;
import apartment.entity.CityEntity;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class CityManagerSpringOld implements CityRepository {

    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public int addCity(CityEntity city) {
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
    public List<CityEntity> getAllCity() {
        return List.of();
    }

    // #TODO
    @Override
    public CityEntity getByName(String name) {
        return null;
    }
}
