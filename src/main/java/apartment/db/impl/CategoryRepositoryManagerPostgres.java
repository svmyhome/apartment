package apartment.db.impl;

import apartment.db.repository.CategoryRepository;
import java.util.List;
import jdk.jfr.Category;

public class CategoryRepositoryManagerPostgres implements CategoryRepository {
    @Override
    public int createCategory(Category category) {
        return 0;
    }

    @Override
    public List<Category> getAll() {
        return List.of();
    }

    @Override
    public Category getByCategory(String category) {
        return null;
    }
}
