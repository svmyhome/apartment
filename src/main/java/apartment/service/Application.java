package apartment.service;

import apartment.entity.AccountEntity;

public class Application {
    private AccountService accountService = new AccountService();
    private CityService cityService = new CityService();
    private SpendService spendService = new SpendService();

    public void run() {
//        accountService.showAllAccounts();
        AccountEntity accountEntity = accountService.login();
        accountService.showCurrentBalance(accountEntity);
        // TODO ALSO NED SHOW Apartment
//        cityService.showAllCities();
//        accountService.showAllAccounts();
        spendService.doSpend(accountEntity);
        accountService.showCurrentBalance(accountEntity);
        spendService.showAllSpends(accountEntity);
    }

}
