package apartment.db.mapper;

import apartment.entity.ItemsEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ItemsEntityRowMapper implements RowMapper<ItemsEntity> {
    @Override
    public ItemsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ItemsEntity()
                .setId(rs.getInt("id"))
                .setCategoryId(rs.getInt("categoryId"))
                .setItemName(rs.getString("itemName"));
    }
}