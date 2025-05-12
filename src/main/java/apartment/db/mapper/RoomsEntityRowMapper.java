package apartment.db.mapper;

import apartment.data.Room;
import apartment.entity.RoomEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class RoomsEntityRowMapper implements RowMapper<RoomEntity> {
    @Override
    public RoomEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new RoomEntity()
                .setId(rs.getInt("id"))
                .setRoomName(Room.valueOf(rs.getString("roomName")));
    }
}