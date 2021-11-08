package Assign2_Q3;

public class Main {
    public static void main(String[] args) {
    	
        AccSavings aS = new AccSavings(12000,5000);
        aS.display();
        
        AccCurrents aC = new AccCurrents(1430,3500);
        aC.display();
        
        double totalBankBalance = aC.getBalance()+ aS.getBalance();
        System.out.println("Total Cash in bank = " + totalBankBalance);
    }
}

/* After Compilation the should be like this
 * 
Initial Balance = 12000.0
Fixed Deposit = 5000.0
Savings Account user total balance= 17000.0

Initial Balance = 1430.0
Credit cash = 3500.0
Current Account user total balance= 4930.0

Total Cash in bank = 21930.0
*
 */
