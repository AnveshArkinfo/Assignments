import java.util.*;

public class Armstrong {
	
	public static void find(int x) {
		int number=x ,n=0 , temp;
		double result= 0;//System.out.println(temp);
		temp = number;
		
		//counting no.of digits
		while(temp!=0) {
			temp = temp/10;
			++n;
		}
		temp = number;
		
		//Checking Armstrong or not
	while(temp!=0) {
			int remainder = temp %10;
			result = result+ Math.pow(remainder, n);
			temp = temp/10;
		}
		if (result == number)
			System.out.println("given number "+number+" is armstrong");
		else
			System.out.println("given number "+number+" is not armstrong");
		
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		num = sc.nextInt();
		find(num);
		
		sc.close();

	}

}
