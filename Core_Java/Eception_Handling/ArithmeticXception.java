
import java.util.Scanner;

public class ArithmeticXception {
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first value");
            int a = sc.nextInt();
            System.out.println("Enter the second value");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result = " + c);
            sc.close();
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("Cannot divide the number by zero");
        }

       
    }

}


/*After execution the output is like this...
 * 
Enter the first value
15
Enter the second value
0
Cannot divide the number by zero
 * 
 */