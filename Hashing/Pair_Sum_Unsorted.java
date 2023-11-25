package Hashing;

import java.util.HashMap;

public class Pair_Sum_Unsorted {

	public Pair_Sum_Unsorted() {
		// TODO Auto-generated constructor stub
	}
	
	static boolean f(int []a,int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(sum-a[i])) {
				return true;
			}
			else {
				map.put(a[i], sum-a[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,2,8,15,-8};
		int sum=17;
		System.out.println(f(a,sum));
	}

}
