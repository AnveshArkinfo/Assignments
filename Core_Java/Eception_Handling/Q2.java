
import java.util.Scanner;

public class Q2 {
	
    static void input(int a ,int b) throws UnsupportedOperationException{
        if (b == 0)
        {
            throw new UnsupportedOperationException("Exception");
        }
        double c = a/b;
        System.out.println("Result = " + c);
    }
    
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator value");
        int a = sc.nextInt();
        System.out.println("Enter the denominator value");
        int b = sc.nextInt();
        sc.close();
        
        try {
            input(a,b);

        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Cannot divide the number by zero");
        }
        
    }
}

class UnsupportedOperationException extends Exception{
    UnsupportedOperationException(String exceptionText){
        super(exceptionText);
    }

}

/*After execution the output is like this...
 * 
Enter the numerator value
12
Enter the denominator value
0
Cannot divide the number by zero

 * 
 */