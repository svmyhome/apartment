package apartment.service;

import apartment.db.impl.CityRepositoryPostgres;
import apartment.db.repository.CityRepository;
import javax.swing.*;

public class CityService {
    private CityRepository cityRepository = new CityRepositoryPostgres();

    public void showAllCities() {
        JOptionPane.showMessageDialog(null, "Список городов: " + cityRepository.getAllCity(),
                "Баланс", JOptionPane.INFORMATION_MESSAGE);

    }
}
