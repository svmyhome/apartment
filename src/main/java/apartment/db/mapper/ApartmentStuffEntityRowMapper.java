package apartment.db.mapper;

import apartment.entity.ApartmentStuffEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ApartmentStuffEntityRowMapper implements RowMapper<ApartmentStuffEntity> {

    @Override
    public ApartmentStuffEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ApartmentStuffEntity()
                .setId(rs.getInt("id"))
                .setFlatId(rs.getInt("flatId"))
                .setRoomId(rs.getInt("roomId"))
                .setItemId(rs.getInt("itemId"));
    }
}