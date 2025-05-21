package apartment.db.impl;

import apartment.db.DataSourceProvider;
import apartment.db.mapper.ApartmentAddressAndCityEntityRowMapper;
import apartment.db.mapper.ApartmentAddressEntityRowMapper;
import apartment.db.mapper.SpendEntityRowMapper;
import apartment.db.repository.ApartmentAddressRepository;
import apartment.entity.AccountEntity;
import apartment.entity.ApartmentAddressAndCityEntity;
import apartment.entity.ApartmentAddressEntity;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class ApartmentAddressRepositoryPostgres implements ApartmentAddressRepository {
    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());


    @Override
    public int createAddress(String address, String street, String house, String flat, AccountEntity account) {
        return jdbcTemplate.update("INSERT INTO apartment_address (account_id, city_id, street, house, flat_number) VALUES(?, ?, ?, ?, ?)", 1, 1, street, house, flat);
    }

    @Override
    public int deleteAddress(int id) {
        return 0;
    }

    @Override
    public List<ApartmentAddressEntity> getAllForAccount(AccountEntity account) {
//        return jdbcTemplate.query("SELECT distinct(name) FROM apartment_address join city on city_id = city.id WHERE account_id=?",
        return jdbcTemplate.query("SELECT * FROM apartment_address join city on city_id = city.id WHERE account_id=?",
                new ApartmentAddressEntityRowMapper(), account.getId());
    }

    @Override
    public List<ApartmentAddressAndCityEntity> showAllCitiesForUser111(AccountEntity account) {
        String sql =
                "SELECT aa.id, aa.account_id, aa.city_id, aa.street, aa.house, aa.flat_number, c.name " +
                        "FROM apartment_address aa " +
                        "JOIN city c ON aa.city_id = c.id WHERE aa.id=?";

        return jdbcTemplate.query(sql, new ApartmentAddressAndCityEntityRowMapper(), account.getId());
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
