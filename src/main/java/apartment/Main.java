package apartment;

import apartment.db.impl.CityRepositoryManagerPostgres;
import apartment.db.repository.CityRepository;
import apartment.service.Application;

public class Main {

    static CityRepository cityRepository = new CityRepositoryManagerPostgres();

    public static void main(String[] args) {
        new Application().run();

//        String cityName = JOptionPane.showInputDialog("Введите название города: ");
//        CityEntity cityEntityList = cityRepository.getByName(cityName);

//        if (cityEntityList == null) {
//            CityEntity city = new CityEntity()
//                    .setName(cityName);
//            cityRepository.addCity(city);
//        } else {
//            JOptionPane.showInputDialog("Введите название города снова: ");
//        }
//
//        cityRepository.getAllCity().forEach(System.out::println);
//        System.out.println(cityRepository.getByName("Вологда"));


    }
}
