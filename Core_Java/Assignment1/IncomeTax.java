import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		int ctc, num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter you CTC : ");
		ctc = sc.nextInt();
		sc.close();
		if(ctc<180000) num =0;
		else if(ctc>180000 && ctc<=300000) num =1;
		else if(ctc>300000 && ctc<=500000) num=2;
		else num=3;
		
		switch(num) {
			case 0 : System.out.println("Nill, Earn some more to pay tax,plzz");
					 break;
			case 1 : System.out.println("you have to pay 10% of tax i.e., : "+ctc*10/100);
					 break;
			case 2 : System.out.println("you have to pay 20% of tax i.e., : "+ctc*20/100);
			 		 break;
			case 3 : System.out.println("you have to pay 30% of tax i.e., : "+ctc*30/100);
			 		 break;
			default : System.out.println("get a job to earn money");
		}
	}

}
