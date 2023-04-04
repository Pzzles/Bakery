
package co.za.mecer.item;

import java.util.List;


public class ItemServiceImplement implements ItemService{
    
    
    private ItemDAO idi;

    public ItemServiceImplement() {
        idi = new ItemDAOImplement();
    }
    
    
    @Override
    public boolean add(Item item) {
        if(item==null){
           return false; 
        }
        return idi.add(item);
    }

    @Override
    public List<Item> read() {
        return idi.read();
    }

    @Override
    public Item getOneItem(int Item_Id) {
        return idi.getOneItem(Item_Id);
    }

    @Override
    public boolean delete(int Item_Id) {
        return idi.delete(Item_Id);
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
