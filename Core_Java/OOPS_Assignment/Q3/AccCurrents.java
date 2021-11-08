package Assign2_Q3;

public class AccCurrents extends Bank{
    public double creditCash;
    	public AccCurrents(double balance ,double creditCash)
    {
        super(balance);
        this.creditCash = creditCash;
    }
    @Override
    public double getBalance()
    {
        double currentBalance = bal + creditCash;
        return currentBalance;
    }
    public void display()
    {
        System.out.println("Initial Balance = " + bal);
        System.out.println("Credit cash = " +  creditCash);
        System.out.println("Current Account user total balance= "+getBalance());
        System.out.println("");
    }
}
