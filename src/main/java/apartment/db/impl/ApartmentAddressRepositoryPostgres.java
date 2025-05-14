package apartment.db.impl;

import apartment.db.DataSourceProvider;
import apartment.db.mapper.ApartmentAddressEntityRowMapper;
import apartment.db.mapper.SpendEntityRowMapper;
import apartment.db.repository.ApartmentAddressRepository;
import apartment.entity.AccountEntity;
import apartment.entity.ApartmentAddressEntity;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class ApartmentAddressRepositoryPostgres implements ApartmentAddressRepository {
    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());


    @Override
    public int createAddress(String address) {
        return 0;
    }

    @Override
    public int deleteAddress(int id) {
        return 0;
    }

    @Override
    public List<ApartmentAddressEntity> getAllForAccount(AccountEntity account) {
        return jdbcTemplate.query("SELECT distinct(name) FROM apartment_address join city on city_id = city.id WHERE account_id=?",
                new ApartmentAddressEntityRowMapper(), account.getId());
    }

    @Override
    public List<ApartmentAddressEntity> getAll() {
        return List.of();
    }

    @Override
    public List<ApartmentAddressEntity> getByStreet(String name) {
        return List.of();
    }
}
