package Assign2_Q7;

public abstract class DessertItem {
	
    public double tax;
    
    public DessertItem (double tax)
    {
        this.tax = tax;
    }
    public abstract void getCost();
}
