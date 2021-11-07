
public class Sort1 {

	public static void main(String[] args) {
		int temp = 0;
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int n= arr.length;
		//Bubble Sort
		for(int i =0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				/* the condition n-i-1 reduces the time complexity
				   for first i=0 iteration, j loop iterates 15-0-1 =14 times
				   bcz, bubble sort performs on 2 values at a time,
				   at the end of every iteration the highest value sorted to its order
				   no need to check those numbers on every iteration*/
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//Printing sorted array values
		for(int elem : arr) {
			System.out.println(elem);
		}

	}

}
