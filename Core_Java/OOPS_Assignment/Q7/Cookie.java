package Assign2_Q7;

public class Cookie extends DessertItem{
    public double euro;
    public Cookie(double euro,double tax)
    {
        super(tax);
        this.euro = euro;
    }
    @Override
    public void getCost(){
        double rupees = 70;
        double x = euro/rupees;
        System.out.println("Price of Cookie is " + (x+tax) + " Euro");
    }
}
