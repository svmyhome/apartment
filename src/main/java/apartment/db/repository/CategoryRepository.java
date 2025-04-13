package apartment.db.repository;

import java.util.List;
import jdk.jfr.Category;

public interface CategoryRepository {

    int createCategory(Category category);

    List<Category> getAll();
    Category getByCategory(String category);

}
