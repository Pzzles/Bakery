package co.za.discount;

public interface DiscountDAO {
    public boolean add(Discount discount);  
    public Discount getOneDiscount(int ItemDiscount_id);
    public boolean delete(int id);
}
