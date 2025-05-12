package apartment.db.impl;

import apartment.db.repository.ItemsRepository;
import apartment.entity.ItemEntity;
import java.util.List;

public class ItemsRepositoryManagerPostgres implements ItemsRepository {
    @Override
    public int createItem(ItemEntity item) {
        return 0;
    }

    @Override
    public List<ItemEntity> getAll() {
        return List.of();
    }

    @Override
    public ItemEntity getByName(String name) {
        return null;
    }
}
