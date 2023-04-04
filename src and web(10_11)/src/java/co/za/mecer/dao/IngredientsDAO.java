package co.za.mecer.dao;

import co.za.mecer.ingredients.Ingredients;
import java.util.List;

public interface IngredientsDAO {
    public boolean addIngredients(Ingredients ingredient);
    public List<Ingredients> readIngredients();
    public boolean delete(int Ingredient_Id);
}
