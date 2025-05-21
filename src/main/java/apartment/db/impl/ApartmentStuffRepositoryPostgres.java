package apartment.db.impl;

import apartment.db.DataSourceProvider;
import apartment.db.mapper.ApartmentAddressEntityRowMapper;
import apartment.db.mapper.ApartmentStuffEntityRowMapper;
import apartment.db.repository.ApartmentStuffRepository;
import apartment.entity.ApartmentAddressEntity;
import apartment.entity.ApartmentStuffEntity;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class ApartmentStuffRepositoryPostgres implements ApartmentStuffRepository {
    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public int createAddress(int flatId, int room, int item) {
        return jdbcTemplate.update("INSERT INTO apartment_stuff (flat_id, room_id, item_id) VALUES(?, ?, ?)", flatId, room, item);

    }

    @Override
    public List<ApartmentStuffEntity> getAll() {
        return jdbcTemplate.query("SELECT * FROM apartment_stuff",
                new ApartmentStuffEntityRowMapper());
    }

    @Override
    public List<ApartmentAddressEntity> getFlatId(int id) {
        return List.of();
    }
}
