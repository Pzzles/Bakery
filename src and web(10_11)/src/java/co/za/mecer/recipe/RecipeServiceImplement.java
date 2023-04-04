/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.recipe;

import java.util.List;

/**
 *
 * @author TRAIN 02
 */
public class RecipeServiceImplement implements RecipeService{
    private RecipeDAO rd;

    public RecipeServiceImplement() {
        rd = new RecipeDAOImplement();
    }
    
    

    @Override
    public boolean add(Recipe recipe) {
        if (recipe == null) {
            return false;
        }
        return rd.add(recipe);
    }

    @Override
    public boolean update(int Recipe_Id, String Measurements) {
        if (Measurements == null) {
            return false;
        }
        return rd.update(Recipe_Id, Measurements);
    }

    @Override
    public List<Recipe> read() {
        return rd.read();
    }

    @Override
    public boolean delete(int Recipe_Id) {
        return rd.delete(Recipe_Id);
    }
    
}
