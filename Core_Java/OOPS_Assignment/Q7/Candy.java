package Assign2_Q7;

public class Candy extends DessertItem{
    public double doller;
    public Candy(double doller,double tax)
    {
        super(tax);
        this.doller = doller;
    }
    
    public void getCost(){
        double rupees = 60;
        double x = doller/rupees;
        System.out.println("Price of Candy is " + (x+tax) + "$" );
    }
}
