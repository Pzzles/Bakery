/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.item;


class Item {
    private int Item_Id;
    private int ItemDiscount_Id;
    private int Category_Id;
    private int Recipe_Id;
    private String Item_Name;
    private double Price;
    private String Allegens;
    private String Desription;

    public Item(int ItemDiscount_Id, int Category_Id, int Recipe_Id, String Item_Name, double Price, String Allegens, String Desription) {
        this.ItemDiscount_Id = ItemDiscount_Id;
        this.Category_Id = Category_Id;
        this.Recipe_Id = Recipe_Id;
        this.Item_Name = Item_Name;
        this.Price = Price;
        this.Allegens = Allegens;
        this.Desription = Desription;
    }

    public Item(String Item_Name, double Price, String Allegens, String Desription) {
        this.Item_Name = Item_Name;
        this.Price = Price;
        this.Allegens = Allegens;
        this.Desription = Desription;
    }

    public int getItemDiscount_Id() {
        return ItemDiscount_Id;
    }

    public void setItemDiscount_Id(int ItemDiscount_Id) {
        this.ItemDiscount_Id = ItemDiscount_Id;
    }
    
    public Item() {
    }
    
    public int getItem_Id() {
        return Item_Id;
    }

    public void setItem_Id(int Item_Id) {
        this.Item_Id = Item_Id;
    }

    public int getCategory_Id() {
        return Category_Id;
    }

    public void setCategory_Id(int Category_Id) {
        this.Category_Id = Category_Id;
    }

    public int getRecipe_Id() {
        return Recipe_Id;
    }

    public void setRecipe_Id(int Recipe_Id) {
        this.Recipe_Id = Recipe_Id;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public void setItem_Name(String Item_Name) {
        this.Item_Name = Item_Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getAllegens() {
        return Allegens;
    }

    public void setAllegens(String Allegens) {
        this.Allegens = Allegens;
    }

    public String getDesription() {
        return Desription;
    }

    public void setDesription(String Desription) {
        this.Desription = Desription;
    }

    @Override
    public String toString() {
        return "Item{" + "Item_Id=" + Item_Id + ", ItemDiscount_Id=" + ItemDiscount_Id + ", Category_Id=" + Category_Id + ", Recipe_Id=" + Recipe_Id + ", Item_Name=" + Item_Name + ", Price=" + Price + ", Allegens=" + Allegens + ", Desription=" + Desription + '}';
    }
}
