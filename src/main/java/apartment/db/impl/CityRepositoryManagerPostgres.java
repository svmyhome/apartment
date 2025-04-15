package apartment.db.impl;

import apartment.db.mapper.CityEntityRowMapper;
import apartment.db.repository.CityRepository;
import apartment.db.DataSourceProvider;
import apartment.entity.CityEntity;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.List;
import java.util.Map;
import org.springframework.lang.Nullable;

public class CityRepositoryManagerPostgres implements CityRepository {

    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public int addCity(CityEntity city) {
        return new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("city")
                .usingGeneratedKeyColumns("id")
                .executeAndReturnKey(Map.of(
                        "name", city.getName()
                )).intValue();

        //        template.update("INSERT INTO city (name) VALUES(?)", cityEntity.getName());
    }

    @Override
    public int deleteCity(int id) {
        return jdbcTemplate.update("DELETE FROM public.city WHERE id = ?", id);
    }

    //TODo
    @Override
    public List<CityEntity> getAllCity() {
        return jdbcTemplate.query("SELECT * FROM city", new CityEntityRowMapper());
    }

    // #TODO
    @Override
    public @Nullable CityEntity getByName(String name) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM city WHERE name = ?", new CityEntityRowMapper(), name);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
