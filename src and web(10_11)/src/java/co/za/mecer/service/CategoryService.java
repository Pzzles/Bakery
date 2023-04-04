package co.za.mecer.service;


import co.za.mecer.category.Category;
import co.za.mecer.category.Category;
import java.util.List;


public interface CategoryService {
    public void add(Category category);
    public List<Category> read();
    public boolean delete(int Category_Id);
}
