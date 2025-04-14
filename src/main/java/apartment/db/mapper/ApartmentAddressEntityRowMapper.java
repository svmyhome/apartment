package apartment.db.mapper;

import apartment.entity.ApartmentAddressEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ApartmentAddressEntityRowMapper implements RowMapper<ApartmentAddressEntity> {

    @Override
    public ApartmentAddressEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ApartmentAddressEntity()
                .setId(rs.getInt("id"))
                .setAccountId(rs.getInt("accountId"))
                .setCityId(rs.getInt("cityId"))
                .setStreet(rs.getString("street"))
                .setHouse(rs.getString("house"))
                .setFlatNumber(rs.getString("house"));
    }
}