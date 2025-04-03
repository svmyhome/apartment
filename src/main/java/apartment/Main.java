package apartment;

import apartment.db.CityRepository;
import apartment.db.DataSourceProvider;
import apartment.db.impl.PostgresCityManagerRepository;
import apartment.entity.CityEntity;
import java.util.List;
import javax.swing.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

    static CityRepository cityRepository = new PostgresCityManagerRepository();

    public static void main(String[] args) {
//        JdbcTemplate template = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

        String cityName = JOptionPane.showInputDialog("Введите название города: ");
        List<CityEntity> cityEntityList = cityRepository.getByName(cityName);

        if (cityEntityList == null) {
            CityEntity city = new CityEntity()
                    .setName(cityName);
            cityRepository.addCity(city);
        }





    }
}
