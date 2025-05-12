package apartment.service;

import apartment.db.impl.CityRepositoryManagerPostgres;
import apartment.db.repository.CityRepository;
import javax.swing.*;

public class CityService {
    CityRepository cityRepository = new CityRepositoryManagerPostgres();

    public void showAllCities() {
        JOptionPane.showMessageDialog(null, "Список городов: " + cityRepository.getAllCity(),
                "Баланс", JOptionPane.INFORMATION_MESSAGE);

    }
}
