class Product{
    protected float unit_price;
    public void setPrice(float unit_price){
        this.unit_price = unit_price;
    }
}
class LocalProduct extends Product{
    private float discount_amt;
    public void setDiscount(float disc_amt){
        this.discount_amt = disc_amt;
    }
    public void getLastPrice(){
        System.out.println("Last Price: " + (unit_price - disc_amt));
    }
}
class Main{
    public static void main(String [] args){
        LocalProduct lp = new LocalProduct();
        lp.setPrice(500.0f);
        lp.setDiscount(100.0f);
        lp.getLastPrice();
    }
}