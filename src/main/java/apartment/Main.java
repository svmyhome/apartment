package apartment;

import apartment.db.DataSourceProvider;
import apartment.entity.CityEntity;
import javax.swing.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

        String cityName = JOptionPane.showInputDialog("Введите город: ");

        CityEntity cityEntity = new CityEntity().setName(cityName);

        template.update("INSERT INTO city (name) VALUES(?)", cityEntity.getName());

    }
}
