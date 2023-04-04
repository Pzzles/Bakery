
package co.za.discount;


public class DiscountServiceImplement implements DiscountService{
    public static void main(String[] args) {
        DiscountService ds = new DiscountServiceImplement();
       // System.out.println(ds.getOneDiscount(11).getDiscount());
        //System.out.println(ds.delete(11));
        Discount disc = new Discount(.5);
        
        ds.add(disc);
        
    }
    private DiscountDAO ddi;

    public DiscountServiceImplement() {
        ddi = new DiscountDAOImplement();
    }

    
    @Override
    public boolean add(Discount discount) {
        if (discount == null) {
            return false;
        }
        return ddi.add(discount);
    }

    @Override
    public boolean delete(int id) {
        return ddi.delete(id);
    }

    @Override
    public Discount getOneDiscount(int ItemDiscount_id) {
        return ddi.getOneDiscount(ItemDiscount_id);
    }
    
}
