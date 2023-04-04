
package co.za.mecer.recipe;

import java.util.List;

public interface RecipeDAO {
    public boolean add(Recipe recipe);
    public boolean update(int Recipe_Id, String Measurements);
    public List<Recipe> read();
     public Recipe getOneDiscount(int Recipe_id);
    public boolean delete(int Recipe_Id);
}
