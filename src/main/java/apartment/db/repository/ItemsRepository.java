package apartment.db.repository;

import apartment.entity.ItemsEntity;
import java.util.List;

public interface ItemsRepository {
    int createItem(ItemsEntity item);

    List<ItemsEntity> getAll();
    ItemsEntity getByName(String name);
}
