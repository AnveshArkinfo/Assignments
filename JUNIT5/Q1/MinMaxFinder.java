package io.Junit5;

public class MinMaxFinder {
	
	public int[] findMinMax( int[] arr1) {
		int[] arr2 = new int[2];
		int temp =0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					temp =arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length-1];
	
		return arr2;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[]{56, 34, 7, 3, 54, 3, 34, 34, 53};
		int[] arrNew;
		MinMaxFinder mmf = new MinMaxFinder();
		mmf.findMinMax(arr);
		arrNew = mmf.findMinMax(arr);
		
		for(int elem: arrNew) {
			System.out.println(elem);
		}
		
	}

}
