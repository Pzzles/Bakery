
package co.za.mecer.dao;

import co.za.mecer.category.Category;
import java.util.List;

public interface CategoryDAO {
    public void add(Category category);
    public List<Category> read();
    public boolean delete(int Category_Id);
}
