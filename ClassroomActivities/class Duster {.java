package ClassroomActivities;
class Duster {
    private float price;
    public void setPrice(float p)
    {
        price= p;
    }   
    public void showPrice()
    {
        System.out.print(price);
    } 

    /*
     * we have created an obejct called Duster. then we set the price attributes of Duster class under private label
     * 
     */
    
}

class Main 
{
    public static void main(String[] args) {
        Duster x = new Duster();
        x.setPrice(50.00f);
        //System.out.print(x.setPrice);
        x.showPrice();
    }
}
