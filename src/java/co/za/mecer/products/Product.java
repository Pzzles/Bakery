/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.products;

/**
 *
 * @author PULE
 */
public class Product {
    private int productID;
   // private int categoryID;
    private String name;
    private double price;
    private String Allergens;
    private String Description;
    private String image;

    public Product() {
        
    }

    public Product(String name, double price, String Allergens, String Description, String image) {
        this.name = name;
        this.price = price;
        this.Allergens = Allergens;
        this.Description = Description;
        this.image = image;
    }
    

    public Product(int productID, String name, double price, String Allergens, String Description, String image) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.Allergens = Allergens;
        this.Description = Description;
        this.image = image;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAllergens() {
        return Allergens;
    }

    public void setAllergens(String Allergens) {
        this.Allergens = Allergens;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", name=" + name + ", price=" + price + ", Allergens=" + Allergens + ", Description=" + Description + ", image=" + image + '}';
    }

        
    
}
