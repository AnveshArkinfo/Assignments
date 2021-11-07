import java.util.Scanner;

public class SearchArrElem {

	public static void main(String[] args) {
		int elem, flag = 0, n=0;
		
		//create an  array of size 15
		int[] arr = new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to search : ");
		elem = sc.nextInt();
		sc.close();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==elem) {
				flag =1;
				n=i;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("The element "+elem+" present in array at index :"+n+" or at position :"+(n+1));
		}
		else {
			System.out.println("Element not found");
		}

	}

}
