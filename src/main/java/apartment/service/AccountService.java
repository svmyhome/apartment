package apartment.service;

import apartment.db.impl.AccountRepositoryManagerPostgres;
import apartment.db.repository.AccountRepository;
import apartment.entity.AccountEntity;
import javax.swing.*;

public class AccountService {

    AccountRepository accountRepository = new AccountRepositoryManagerPostgres();

    public AccountEntity login() {
        String accountName = JOptionPane.showInputDialog("Введите имя: ");
        AccountEntity account = accountRepository.getByName(accountName);
        if (account == null) {
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
            return account;
        }
    }

    public void showCurrentBalance(AccountEntity account) {
        JOptionPane.showMessageDialog(null, "Текущий баланс: " + account.getBalance(),
                "Баланс", JOptionPane.INFORMATION_MESSAGE);

    }


}
