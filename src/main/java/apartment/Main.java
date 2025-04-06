package apartment;

import apartment.db.AccountRepository;
import apartment.db.CityRepository;
import apartment.db.impl.AccountManagerRepositoryPostgres;
import apartment.db.impl.CityManagerRepositoryPostgres;
import apartment.entity.AccountEntity;
import apartment.entity.CityEntity;
import javax.swing.*;

public class Main {

    static CityRepository cityRepository = new CityManagerRepositoryPostgres();
    static AccountRepository accountRepository = new AccountManagerRepositoryPostgres();

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

        String accountName = JOptionPane.showInputDialog("Введите имя: ");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Введите балансе: "));

        AccountEntity account = new AccountEntity()
                .setAccount(accountName)
                .setBalance(balance);




        accountRepository.addAccount(account);
        accountRepository.getAll().forEach(System.out::println);
        System.out.println(accountRepository.getByName("Voldemar"));


    }
}
