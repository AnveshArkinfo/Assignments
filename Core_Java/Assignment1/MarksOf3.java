import java.util.Scanner;

public class MarksOf3 {
		
	public static void main(String[] args) {
		int s1A,s1B,s1C, s2A,s2B,s2C, s3A,s3B,s3C;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Student 1 ===");
			System.out.println("Enter sub-A marks : ");
			s1A = sc.nextInt();
			System.out.println("Enter sub-B marks : ");
			s1B = sc.nextInt();
			System.out.println("Enter sub-C marks : ");
			s1C = sc.nextInt();
		System.out.println("=== Student 2 ===");
			System.out.println("Enter sub-A marks : ");
			s2A = sc.nextInt();
			System.out.println("Enter sub-B marks : ");
			s2B = sc.nextInt();
			System.out.println("Enter sub-C marks : ");
			s2C = sc.nextInt();
		System.out.println("=== Student 3 ===");
			System.out.println("Enter sub-A marks : ");
			s3A = sc.nextInt();
			System.out.println("Enter sub-B marks : ");
			s3B = sc.nextInt();
			System.out.println("Enter sub-C marks : ");
			s3C = sc.nextInt();
		
		System.out.println("total scored by student1 is : "+(s1A+s1B+s1C)+" and avg is : "+(s1A+s1B+s1C)/3);
		System.out.println("total scored by student2 is : "+(s2A+s2B+s2C)+" and avg is : "+(s2A+s2B+s2C)/3);
		System.out.println("total scored by student3 is : "+(s3A+s3B+s3C)+" and avg is : "+(s3A+s3B+s3C)/3);
		System.out.println("total scored by students in sub-A is : "+(s1A+s2A+s3A)+" and avg is : "+(s1A+s2A+s3A)/3);
		System.out.println("total scored by students in sub-B is : "+(s1B+s2B+s3B)+" and avg is : "+(s1B+s2B+s3B)/3);
		System.out.println("total scored by students in sub-C is : "+(s1C+s2B+s3C)+" and avg is : "+(s1C+s2B+s3C)/3);
		sc.close();
	}
}
