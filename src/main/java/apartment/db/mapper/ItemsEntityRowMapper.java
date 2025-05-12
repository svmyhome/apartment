package apartment.db.mapper;

import apartment.entity.ItemEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ItemsEntityRowMapper implements RowMapper<ItemEntity> {
    @Override
    public ItemEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ItemEntity()
                .setId(rs.getInt("id"))
                .setCategoryId(rs.getInt("categoryId"))
                .setItemName(rs.getString("itemName"));
    }
}