
import java.util.Scanner;

    public class WithdrawXception {
    	
        double balance= 2000.00;
        long id= 54378;
        double deposit,amount;
        public void savingsaccount()  {
            System.out.println("account Id "+id);
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            
                try {
                    if(n==1){
                        System.out.println("enter withdraw amount");
                        amount=sc.nextDouble();
                        withdraw();
                    }
                    if(n==2) {
                        System.out.println("enter deposit amount");
                        amount=sc.nextDouble();
                        deposit=balance+amount;
                        System.out.println("Total amount "+deposit);
                    }
                }
                catch(InsufficientBalanceException e) {
                    System.out.println(e);}
                catch(IllegalBankTransactionException e) {
                    System.out.println(e);
                }
            }
        
        public void withdraw() throws InsufficientBalanceException,IllegalBankTransactionException
        {
            if(amount>balance)
            {
                throw new InsufficientBalanceException("insufficient balance enter less amount");
            }else{balance = balance-amount;
                if(amount<0) {
                    throw new IllegalBankTransactionException("enter valid amount");
                }
                System.out.println("current balance "+balance);}}

        public static void main(String args[])
        {
        	Scanner sc = new Scanner(System.in);
        	WithdrawXception at= new WithdrawXception();
            at.savingsaccount();
            sc.close();
        }
        }
    class IllegalBankTransactionException extends Exception{
        public IllegalBankTransactionException(String msg) {
            super(msg);
        }

    }
    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg);
        }

    }


/*After execution the output is like this...
 * 
Case 1: 
account Id 54378
Choose 1 for Withdraw
Choose 2 for Deposit

1
enter withdraw amount
2100
InsufficientBalanceException: insufficient balance enter less amount

=======================================
Case 2:
account Id 54378
Choose 1 for Withdraw
Choose 2 for Deposit
1
enter withdraw amount
500
current balance 1500.0
======================================
Case 3:
account Id 54378
Choose 1 for Withdraw
Choose 2 for Deposit
2
enter deposit amount
5200
Total amount 7200.0
 * 
 */