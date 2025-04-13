package apartment.db.repository;

import apartment.entity.AccountEntity;
import java.util.List;

public interface AccountRepository {
    List<AccountEntity> getAll();

    AccountEntity getByName(String name);

    void addAccount(AccountEntity account);

}
