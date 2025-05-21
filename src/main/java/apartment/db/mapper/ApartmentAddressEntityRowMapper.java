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
                .setAccountId(rs.getInt("account_id"))
                .setCityId(rs.getInt("city_id"))
                .setStreet(rs.getString("street"))
                .setHouse(rs.getString("house"))
                .setFlatNumber(rs.getString("flat_number"));
    }
}