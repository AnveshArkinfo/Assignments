import java.util.*;
public class SupplyMarks {

	public static void main(String[] args) {
		int s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject1 marks : ");
		s1= sc.nextInt();
		System.out.println("Enter subject2 marks : ");
		s2= sc.nextInt();
		System.out.println("Enter subject3 marks : ");
		s3= sc.nextInt();
		sc.close();
		
		if(s1>60 && s2>60 && s3>60) 
			{System.out.println("PASSED");}
		else if((s1>60&&s2>60) || (s2>60&&s3>60) || (s3>60&&s1>60))
			{System.out.println("PROMOTED");}
		else {System.out.println("FAILED");}

	}

}
