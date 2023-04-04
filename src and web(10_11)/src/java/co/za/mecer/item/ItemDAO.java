
package co.za.mecer.item;

import java.util.List;


public interface ItemDAO {
    public boolean add(Item item);
//    public boolean update();
    public List<Item> read();
    public Item getOneItem(int Item_Id);
    public boolean delete(int Item_Id);
    
}
