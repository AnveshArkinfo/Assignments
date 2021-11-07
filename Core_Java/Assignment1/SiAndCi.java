import java.util.*;

public class SiAndCi {

	public static void main(String[] args) {
		double p,t, r, sInterest, cInterest;
		//S.I = P*T*R where R= r/100 i.e., if  R=2% that means R =2/100
		// C.I = p(1+r/100)power t
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle amount : ");
		p = sc.nextDouble();
		System.out.println("enter time or no.of years : ");
		t = sc.nextDouble();
		System.out.println("enter rate of interest : ");
		r = sc.nextDouble();
		sc.close();
		
		// Simple Interest
		sInterest = (p*t*r)/100;
		System.out.println("Simple Interest for money "+p+" is :"+sInterest);
		
		//Compound Interest
		double amount =p*Math.pow((1+r/100), t);
		cInterest =amount-p;
		System.out.println("Compound Interest for money "+p+" is :"+cInterest);
	
	}

}
