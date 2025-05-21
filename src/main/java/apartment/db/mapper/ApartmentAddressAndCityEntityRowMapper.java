package apartment.db.mapper;

import apartment.entity.ApartmentAddressAndCityEntity;
import apartment.entity.ApartmentAddressEntity;
import apartment.entity.CityEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ApartmentAddressAndCityEntityRowMapper implements RowMapper<ApartmentAddressAndCityEntity> {

    @Override
    public ApartmentAddressAndCityEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        CityEntity city = new CityEntity()
                .setId(rs.getInt("city_id"))
                .setName(rs.getString("city_name"));

        return new ApartmentAddressAndCityEntity()
                .setId(rs.getInt("aa.id"))
                .setAccountId(rs.getInt("aa.account_id"))
                .setCityId(rs.getInt("aa.city_id"))
                .setStreet(rs.getString("aa.street"))
                .setHouse(rs.getString("aa.house"))
                .setFlatNumber(rs.getString("aa.flat_number"))
                .setCity(rs.getString("c.name"));

    }
}