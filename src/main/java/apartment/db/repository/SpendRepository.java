package apartment.db.repository;

import apartment.entity.SpendEntity;
import java.util.List;

public interface SpendRepository {

    List<SpendEntity> getAll();

    SpendEntity getByName();
}
