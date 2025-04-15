package apartment.db.mapper;

import apartment.data.Rooms;
import apartment.entity.RoomsEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class RoomsEntityRowMapper implements RowMapper<RoomsEntity> {
    @Override
    public RoomsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new RoomsEntity()
                .setId(rs.getInt("id"))
                .setRoomName(Rooms.valueOf(rs.getString("roomName")));
    }
}