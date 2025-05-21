package apartment.service;

import apartment.data.ItemCategory;
import apartment.db.impl.AccountRepositoryPostgres;
import apartment.db.impl.ApartmentAddressRepositoryPostgres;
import apartment.db.impl.CityRepositoryPostgres;
import apartment.db.impl.SpendRepositoryPostgres;
import apartment.db.repository.AccountRepository;
import apartment.db.repository.ApartmentAddressRepository;
import apartment.db.repository.CityRepository;
import apartment.db.repository.SpendRepository;
import apartment.entity.AccountEntity;
import java.util.Arrays;
import javax.swing.*;

public class CityService {
    private CityRepository cityRepository = new CityRepositoryPostgres();
    private SpendRepository spendRepository = new SpendRepositoryPostgres();
    private AccountRepository accountRepository = new AccountRepositoryPostgres();
    private ApartmentAddressRepository addressRepository = new ApartmentAddressRepositoryPostgres();

    public void showAllCities() {
        JOptionPane.showMessageDialog(null, "Список городов: " + cityRepository.getAllCity(),
                "Список городов", JOptionPane.INFORMATION_MESSAGE);

    }

    public void showAllCitiesForUser(AccountEntity account) {
        JOptionPane.showMessageDialog(null, "Список городов: " + addressRepository.getAllForAccount(account),
                "Список городов", JOptionPane.INFORMATION_MESSAGE);

    }

    public void showAllCitiesForUser111(AccountEntity account) {
        JOptionPane.showMessageDialog(null, "Список городов: " + addressRepository.showAllCitiesForUser111(account),
                "Список городов", JOptionPane.INFORMATION_MESSAGE);

    }

    // TODO ApartmentAddress
    public void selectCity(AccountEntity account) {
        int index = JOptionPane.showOptionDialog(
                null,
                "Город",
                "Выберите город",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                Arrays.stream(ItemCategory.values()).map(ItemCategory::getDescription).toArray(String[]::new),
                ItemCategory.ELECTRONICS.getDescription()
        );

        ItemCategory selected = ItemCategory.values()[index];
//        double spendValue = Double.parseDouble(JOptionPane.showInputDialog("Введите сумму: "));
//        String description = JOptionPane.showInputDialog("введите описание траты: ");
//        if (isSpendAcceptedForGivenUser(account, spendValue)) {
//            SpendEntity spend = new SpendEntity()
//                    .setSpend(spendValue)
//                    .setSpendCategory(selected)
//                    .setAccount_id(account.getId())
//                    .setDescription(description);
//            spendRepository.addSpend(spend);
//            account.setBalance(account.getBalance() - spendValue);
//            accountRepository.updateAccount(account);
//        } else {
//            JOptionPane.showMessageDialog(null, "Невозможно совершить списание", "Ошибка",
//                    JOptionPane.ERROR_MESSAGE);
//        }

    }

}
