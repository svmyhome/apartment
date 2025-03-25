package apartment;

import apartment.domain.City;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CityManager {
    private DataSource ds = DataSourceProvider.INSTANCE.getDataSource();

//    INSERT INTO public.city (name)
//    VALUES ('Вологда'),
//       ('Москва'),
//               ('Санкт-Петербург')
//    ON CONFLICT (name) DO NOTHING;

    public int createCity(City city) {

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement("INSERT INTO public.city (name)\n" +
                             "VALUES (?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, city.getName());
            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int deleteCity(int id) {

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement("DELETE FROM public.city WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }


}
