
package co.za.mecer.service;

import co.za.mecer.service.CategoryService;
import co.za.mecer.category.Category;
import co.za.mecer.category.Category;
import co.za.mecer.dao.CategoryDAOImplement;
import co.za.mecer.dao.CategoryDAOImplement;
import java.util.List;


public class CategoryServiceImplement implements CategoryService{
 
    private CategoryDAOImplement catDAo;

    public CategoryServiceImplement() {
       catDAo = new CategoryDAOImplement();
    }
    
    
    @Override
    public void add(Category category) {
     catDAo.add(category);
    }

    @Override
    public List<Category> read() {
        return catDAo.read();
    }

    @Override
    public boolean delete(int Category_Id) {
        return catDAo.delete(Category_Id);
    }
    
}
