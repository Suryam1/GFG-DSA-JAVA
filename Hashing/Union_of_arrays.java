package Hashing;

import java.util.HashSet;

public class Union_of_arrays {

	public Union_of_arrays() {
		// TODO Auto-generated constructor stub
	}
	
	static int f(int []a,int []b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			set.add(b[i]);
		}
		return set.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {15,20,5,15};
		int[] b = {15,15,15,20,10};
		System.out.println(f(a,b));
	}

}
