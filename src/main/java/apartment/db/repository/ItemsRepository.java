package apartment.db.repository;

import apartment.entity.ItemEntity;
import java.util.List;

public interface ItemsRepository {
    int createItem(ItemEntity item);

    List<ItemEntity> getAll();

    ItemEntity getByName(String name);
}
