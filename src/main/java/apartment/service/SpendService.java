package apartment.service;

import apartment.data.ItemCategory;
import apartment.db.impl.AccountRepositoryPostgres;
import apartment.db.impl.SpendRepositoryPostgres;
import apartment.db.repository.AccountRepository;
import apartment.db.repository.SpendRepository;
import apartment.entity.AccountEntity;
import apartment.entity.SpendEntity;
import java.util.Arrays;
import javax.swing.*;

public class SpendService {

    private SpendRepository spendRepository = new SpendRepositoryPostgres();
    private AccountRepository accountRepository = new AccountRepositoryPostgres();

    public void doSpend(AccountEntity account) {
        int index = JOptionPane.showOptionDialog(
                null,
                "Категория",
                "Выберите категорию траты",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                Arrays.stream(ItemCategory.values()).map(ItemCategory::getDescription).toArray(String[]::new),
                ItemCategory.ELECTRONICS.getDescription()
        );

        ItemCategory selected = ItemCategory.values()[index];
        String description = JOptionPane.showInputDialog("Введите описание траты: ");
        double spendValue = Double.parseDouble(JOptionPane.showInputDialog("Введите сумму: "));
        if (isSpendAcceptedForGivenUser(account, spendValue)) {
            SpendEntity spend = new SpendEntity()
                    .setSpend(spendValue)
                    .setSpendCategory(selected)
                    .setAccount_id(account.getId())
                    .setDescription(description);
            spendRepository.addSpend(spend);
            account.setBalance(account.getBalance() - spendValue);
            accountRepository.updateAccount(account);
        } else {
            JOptionPane.showMessageDialog(null, "Невозможно совершить списание", "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private boolean isSpendAcceptedForGivenUser(AccountEntity givenUser, double spend) {
        if (spend <= 0) {
            return false;
        }
        if (givenUser.getBalance() < spend) {
            return false;
        }
        return true;
    }

    public void showAllSpends(AccountEntity account) {
        Object[][] rows = spendRepository.getAllForAccount(account)
                .stream()
                .map(spend -> new Object[]{spend.getSpendCategory().getDescription(), spend.getSpend(), spend.getDescription()})
                .toArray(Object[][]::new);
        Object[] headers = {"Категория", "Размер траты", "Описание траты"};
        JTable table = new JTable(rows, headers);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }
}
