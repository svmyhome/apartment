package apartment.service;

import apartment.entity.AccountEntity;

public class Application {
    AccountService accountService = new AccountService();

    public void run() {
        AccountEntity accountEntity = accountService.login();
        accountService.showCurrentBalance(accountEntity);
    }

}
