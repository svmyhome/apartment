package apartment.service;

import apartment.entity.AccountEntity;

public class Application {
    AccountService accountService = new AccountService();
    CityService cityService = new CityService();

    public void run() {
        accountService.showAllAccounts();
        AccountEntity accountEntity = accountService.login();
        accountService.showCurrentBalance(accountEntity);
        // TODO ALSO NED SHOW Apartment
        cityService.showAllCities();
        accountService.showAllAccounts();
    }

}
