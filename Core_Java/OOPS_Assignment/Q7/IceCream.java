package Assign2_Q7;

public class IceCream extends DessertItem{
    public double rupees;
    public IceCream(double rupees,double tax)
    {
        super(tax);
        this.rupees = rupees;
    }
    @Override
    public void getCost(){
        System.out.println("Price of Icecream is " + (rupees+tax) + " rupees");
    }
}
