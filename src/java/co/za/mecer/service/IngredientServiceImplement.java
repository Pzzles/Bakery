
package co.za.mecer.service;

import co.za.mecer.ingredients.Ingredients;
import co.za.mecer.dao.IngredientsDAOImplement;
import co.za.mecer.service.IngredientService;
import co.za.mecer.ingredients.Ingredients;
import co.za.mecer.dao.IngredientsDAOImplement;
import java.util.List;

public class IngredientServiceImplement implements IngredientService{

    private IngredientsDAOImplement ingredDAO;

    public IngredientServiceImplement() {
        ingredDAO = new IngredientsDAOImplement();
    }
   
    @Override
    public boolean addIngredients(Ingredients ingredient) {
        if (ingredient == null){
            return false;
        }
        return ingredDAO.addIngredients(ingredient);
    }

    @Override
    public List<Ingredients> readIngredients() {
        return ingredDAO.readIngredients();
    }

    @Override
    public boolean delete(int Ingredient_Id) {
        return ingredDAO.delete(Ingredient_Id);
    }
    
}
