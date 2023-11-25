package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining_Imple {
	
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	
	public Chaining_Imple(int b) {
		// TODO Auto-generated constructor stub
		BUCKET=b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	
	void insert(int key) {
		int i=key%BUCKET;
		table.get(i).add(key);
	}
	
	void remove(int key) {
		int i=key%BUCKET;
		table.get(i).remove((Integer)key);
	}
	
	boolean search(int key) {
		int i=key%BUCKET;;
		return table.get(i).contains(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chaining_Imple obj = new Chaining_Imple(7);
		obj.insert(70);
	    obj.insert(71);
	    obj.insert(9);
	    obj.insert(56);
	    obj.insert(72);
	    System.out.println(obj.search(56));
	    System.out.println(obj.search(51));
	    System.out.println(obj.search(9));
	    obj.remove(9);
	    System.out.println(obj.search(9));
	}

}
