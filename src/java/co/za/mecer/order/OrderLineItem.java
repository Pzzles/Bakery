
package co.za.mecer.order;

import co.za.mecer.item.Item;

/**
 *
 * @author PULE
 */
public class OrderLineItem {
    private int quantity;

    
    private Item item;
    
    public OrderLineItem() {
    }

    public OrderLineItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderLineItem{quantity=").append(quantity);
        sb.append(", item=").append(item);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
