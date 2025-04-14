package apartment.db.mapper;


import apartment.data.ItemCategory;
import apartment.entity.CategoryEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CategoryEntityRowMapper implements RowMapper<CategoryEntity> {
    @Override
    public CategoryEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CategoryEntity()
                .setId(rs.getInt("id"))
                .setCategory(ItemCategory.valueOf(rs.getString("category")));
    }
}