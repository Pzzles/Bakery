
package co.za.mecer.category;

public class Category {
    private int Category_Id;
    private String Category;

    public Category() {
    }

    public Category(String Category) {
      
        this.Category = Category;
    }
    
    public Integer getCategory_Id() {
        return Category_Id;
    }

    public void setCategory_Id(Integer Category_Id) {
        this.Category_Id = Category_Id;
    }
    
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
}
