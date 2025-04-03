package apartment;

import apartment.db.CityRepository;
import apartment.db.impl.PostgresCityManagerRepository;
import apartment.entity.CityEntity;
import javax.swing.*;

public class Main {

    static CityRepository cityRepository = new PostgresCityManagerRepository();

    public static void main(String[] args) {

        String cityName = JOptionPane.showInputDialog("Введите название города: ");
        CityEntity cityEntityList = cityRepository.getByName(cityName);

        if (cityEntityList == null) {
            CityEntity city = new CityEntity()
                    .setName(cityName);
            cityRepository.addCity(city);
        } else {
            JOptionPane.showInputDialog("Введите название города снова: ");
        }

        cityRepository.getAllCity().forEach(System.out::println);
        System.out.println(cityRepository.getByName("Вологда"));





    }
}
