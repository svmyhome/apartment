package apartment.db;

import apartment.entity.CityEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.tree.TreePath;
import org.springframework.jdbc.core.RowMapper;

public class CityEntityRowMapper implements RowMapper<CityEntity> {

    @Override
    public CityEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CityEntity()
                .setId(rs.getInt("id"))
                .setName(rs.getString("name"));
    }
}
