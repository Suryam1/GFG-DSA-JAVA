package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency_in_array {

	public Frequency_in_array() {
		// TODO Auto-generated constructor stub
	}
	
	static void f(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,12,10,15,10,20,12,12};
		f(arr);
	}

}
