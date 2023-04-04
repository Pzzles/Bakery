
package co.za.mecer.service;

import co.za.mecer.ingredients.Ingredients;
import co.za.mecer.ingredients.Ingredients;

import java.util.List;

public interface IngredientService {
    public boolean addIngredients(Ingredients ingredient);
    public List<Ingredients> readIngredients();
    public boolean delete(int Ingredient_Id);
}
