package apartment.db.impl.old;

import apartment.db.repository.CityRepository;
import apartment.db.DataSourceProvider;
import apartment.entity.CityEntity;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityManager implements CityRepository {
    private DataSource ds = DataSourceProvider.INSTANCE.getDataSource();

    @Override
    public int addCity(CityEntity city) {

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

    @Override
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

    //TODO
    @Override
    public List<CityEntity> getAllCity() {
        List<CityEntity> result = new ArrayList<>();
        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(
                     "SELECT * FROM public.city")) {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                result.add(CityEntity.builder()
                        .name(resultSet.getString("name"))
                        .build());
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public CityEntity getByName(String name) {
        CityEntity result = null;

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(
                     "SELECT * FROM public.city WHERE name = ?")) {
            ps.setString(1, name);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                result = CityEntity.builder()
                        .name(resultSet.getString("name"))
                        .build();
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
