package apartment.service;

import apartment.db.impl.AccountRepositoryPostgres;
import apartment.db.repository.AccountRepository;
import apartment.entity.AccountEntity;
import javax.swing.*;

public class AccountService {

    private AccountRepository accountRepository = new AccountRepositoryPostgres();

    public AccountEntity login() {
        String accountName = JOptionPane.showInputDialog("Введите имя: ");
        AccountEntity workAccount = accountRepository.getByName(accountName);
        if (workAccount == null) {
            double balance = Double.parseDouble(JOptionPane.showInputDialog("Введите балансе: "));
            AccountEntity newAccount = new AccountEntity()
                    .setAccount(accountName)
                    .setBalance(balance);
            accountRepository.addAccount(newAccount);
            accountRepository.getAll().forEach(System.out::println);
            System.out.println(accountRepository.getByName("Voldemar"));
            return accountRepository.getByName(accountName);
        } else {
            accountRepository.getAll().forEach(System.out::println);
            System.out.println(accountRepository.getByName("Voldemar"));
            return workAccount;
        }
    }

    public void showCurrentBalance(AccountEntity account) {
        JOptionPane.showMessageDialog(null, "Текущий баланс: " + account.getBalance(),
                "Баланс", JOptionPane.INFORMATION_MESSAGE);

    }

    public void showAllAccounts() {
        JOptionPane.showMessageDialog(null,
                "Список всех пользователей: " + accountRepository.getAll(),
                "Список пользователей", JOptionPane.INFORMATION_MESSAGE);
    }


}
