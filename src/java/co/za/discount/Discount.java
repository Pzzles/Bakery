
package co.za.discount;


public class Discount {
    public int ItemDiscount_id = 8;
    public Double discount;

    public Discount() {
    }

    public Discount(Double discount) {
        this.discount = discount;
    }

    public int getItemDiscount_id() {
        return ItemDiscount_id;
    }

    public void setItemDiscount_id(int ItemDiscount_id) {
        this.ItemDiscount_id = ItemDiscount_id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Item_Discount{" + "ItemDiscount_id=" + ItemDiscount_id + ", discount=" + discount + '}';
    }
}
