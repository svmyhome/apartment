package apartment;

import apartment.db.repository.AccountRepository;
import apartment.db.repository.CityRepository;
import apartment.db.impl.AccountRepositoryManagerPostgres;
import apartment.db.impl.CityRepositoryManagerPostgres;
import apartment.entity.AccountEntity;
import apartment.entity.CityEntity;
import javax.swing.*;

public class Main {

    static CityRepository cityRepository = new CityRepositoryManagerPostgres();
    static AccountRepository accountRepository = new AccountRepositoryManagerPostgres();

    public static void main(String[] args) {

        String accountName = JOptionPane.showInputDialog("Введите имя: ");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Введите балансе: "));
        AccountEntity account = accountRepository.getByName(accountName);
        if (account == null) {
            AccountEntity newAccount = new AccountEntity()
                    .setAccount(accountName)
                    .setBalance(balance);
            accountRepository.addAccount(newAccount);
        } else {
            JOptionPane.showInputDialog("Введите Account повторно : ");
        }

        accountRepository.getAll().forEach(System.out::println);
        System.out.println(accountRepository.getByName("Voldemar"));

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
