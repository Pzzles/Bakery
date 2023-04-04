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
public interface RecipeService {
    public boolean add(Recipe recipe);
    public boolean update(int Recipe_Id, String Measurements);
    public List<Recipe> read();
    public boolean delete(int Recipe_Id);
}
