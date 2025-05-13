package apartment.db.repository;

import apartment.entity.AccountEntity;
import apartment.entity.SpendEntity;
import java.util.List;

public interface SpendRepository {

    List<SpendEntity> getAllForAccount(AccountEntity account);

    void addSpend(SpendEntity spend);

    SpendEntity getByName();
}
