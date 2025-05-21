package black;

import apartment.db.impl.AccountRepositoryPostgres;
import apartment.db.impl.ApartmentAddressRepositoryPostgres;
import apartment.db.impl.ApartmentStuffRepositoryPostgres;
import apartment.db.impl.CityRepositoryPostgres;
import apartment.db.repository.AccountRepository;
import apartment.db.repository.CityRepository;
import apartment.entity.AccountEntity;
import apartment.entity.CityEntity;

public class SelectToDB {
    public static void main(String[] args) {
        CityRepository cityRepository = new CityRepositoryPostgres();
        AccountRepository accountRepository = new AccountRepositoryPostgres();
        AccountEntity workAccount = accountRepository.getByName("Vladimir");
        ApartmentAddressRepositoryPostgres addressRepositoryPostgres = new ApartmentAddressRepositoryPostgres();
//        addressRepositoryPostgres.createAddress("Петропавло2","xdcdc2", "311", "211", workAccount);

        ApartmentStuffRepositoryPostgres apartmentStuffRepositoryPostgres = new ApartmentStuffRepositoryPostgres();
        apartmentStuffRepositoryPostgres.createAddress(1, 3, 1);

        System.out.println(workAccount);
        System.out.println(cityRepository.getAllCity());
        System.out.println(addressRepositoryPostgres.getAllForAccount(workAccount));
        System.out.println(addressRepositoryPostgres.getAll());
    }
}
