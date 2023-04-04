package co.za.mecer.recipe;

public class Recipe {
    private int Recipe_Id;
    private int Ingredient_Id;
    private String Measurements;

    public Recipe() {
    }

    public int getRecipe_Id() {
        return Recipe_Id;
    }

    public Recipe(int Ingredient_Id, String Measurements) {
        this.Ingredient_Id = Ingredient_Id;
        this.Measurements = Measurements;
    }
    

    public void setRecipe_Id(int Recipe_Id) {
        this.Recipe_Id = Recipe_Id;
    }

    public int getIngredient_Id() {
        return Ingredient_Id;
    }

    public void setIngredient_Id(int Ingredient_Id) {
        this.Ingredient_Id = Ingredient_Id;
    }

    public String getMeasurements() {
        return Measurements;
    }

    public void setMeasurements(String Measurements) {
        this.Measurements = Measurements;
    }
    
}
