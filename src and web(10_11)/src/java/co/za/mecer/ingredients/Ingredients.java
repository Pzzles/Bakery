
package co.za.mecer.ingredients;


public class Ingredients {
    private int Ingredient_Id;
    private String Ingredient_Name;

    public Ingredients() {
    }

    public Ingredients(String Ingredient_Name) {
        this.Ingredient_Name = Ingredient_Name;
    }

    public int getIngredient_Id() {
        return Ingredient_Id;
    }

    public void setIngredient_Id(int Ingredient_Id) {
        this.Ingredient_Id = Ingredient_Id;
    }

    public String getIngredient_Name() {
        return Ingredient_Name;
    }

    public void setIngredient_Name(String Ingredient_Name) {
        this.Ingredient_Name = Ingredient_Name;
    }
}
