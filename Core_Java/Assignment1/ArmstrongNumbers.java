
public class ArmstrongNumbers {
	
	public static void find(int x) {
		int temp, n=0, res =0;
		
		temp=x;
		while(temp !=0) {
			temp/=10; //temp = temp/10;
			++n;
		}
		
		temp = x;
		while(temp!=0) {
			int remain = temp%10;
			res+=Math.pow(remain,n); //res= res+Math.pow(remain,n);
			
			temp/=10; //temp = temp/10;
		}
		if(res == x)
		System.out.print(res+", ");
	}

	public static void main(String[] args) {
		int num= 100;
		System.out.print("The Armstrong numbers between 100-999 are : ");
		 for(int i=num; i<=999;i++) {
			 find(i);
		 }

	}

}
