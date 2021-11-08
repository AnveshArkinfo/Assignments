package Assign2_Q3;

public class AccSavings extends Bank{
    public double fixedDeposit;
    public AccSavings(double balance ,double fixedDeposit)
    {
        super(balance);
        this.fixedDeposit = fixedDeposit;
    }
    @Override
    public double getBalance()
    {
        double savingBalance = bal + fixedDeposit;
        return savingBalance;
    }
    public void display()
    {
        System.out.println("Initial Balance = " + bal);
        System.out.println("Fixed Deposit = " + fixedDeposit);
        System.out.println("Savings Account user total balance= "+ getBalance());
        System.out.println("");
    }
}