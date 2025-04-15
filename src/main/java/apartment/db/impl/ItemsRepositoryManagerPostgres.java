package apartment.db.impl;

import apartment.db.repository.ItemsRepository;
import apartment.entity.ItemsEntity;
import java.util.List;

public class ItemsRepositoryManagerPostgres implements ItemsRepository {
    @Override
    public int createItem(ItemsEntity item) {
        return 0;
    }

    @Override
    public List<ItemsEntity> getAll() {
        return List.of();
    }

    @Override
    public ItemsEntity getByName(String name) {
        return null;
    }
}
