package apartment.db.mapper;

import apartment.data.ItemCategory;
import apartment.entity.SpendEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class SpendEntityRowMapper implements RowMapper<SpendEntity> {
    @Override
    public SpendEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new SpendEntity()
                .setId(rs.getInt("id"))
                .setDescription(rs.getString("description"))
                .setAccount_id(rs.getInt("account_id"))
                .setSpendCategory(ItemCategory.valueOf(rs.getString("spend_category")))
                .setSpend(rs.getDouble("spend"));
    }
}
