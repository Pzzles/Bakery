
package co.za.mecer.item;


import co.za.mecer.item.Item;
import co.za.mecer.item.ItemService;
import co.za.mecer.item.ItemServiceImplement;


public class BakeryTestClass {
    public static void main(String[] args) {
        ItemService is = new ItemServiceImplement();
        
        System.out.println(is.getOneItem(1).getItemDiscount_Id());
        }
}