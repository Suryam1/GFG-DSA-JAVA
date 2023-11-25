package Hashing;

import java.util.HashSet;

public class Count_Distinct {

	public Count_Distinct() {
		// TODO Auto-generated constructor stub
	}
	
	static int f(int arr[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		return set.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {15,12,13,12,13,13,18};
		System.out.println(f(arr));
	}

}
