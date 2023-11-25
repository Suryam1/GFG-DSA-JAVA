package Hashing;

import java.util.HashSet;

public class Intersection_of_arrays {

	public Intersection_of_arrays() {
		// TODO Auto-generated constructor stub
	}
	
	static int f(int[] a,int[] b) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(set.contains(b[i])) {
				count++;
				set.remove(b[i]);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,15,20,15,30,30,5};
		int[] b= {30,5,30,8};
		System.out.println(f(a,b));
	}

}
