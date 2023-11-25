package Hashing;

public class Open_Addressing {
	
	int cap;
	int[] arr;

	public Open_Addressing(int c) {
		cap=c;
		arr=new int[c];
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
	}
	
	int hash(int key) {
		return key%cap;
	}
	
	boolean search(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if(arr[i]==key) {
				return true;
			}
			i=(i+1)%cap;
			if(i==h) {
				return false;
			}
		}
		return false;
	}
	
	void insert(int key) {
		int h=hash(key);
		while(arr[h]!=-1&&arr[h]!=-2&&arr[h]!=key) {
			h=(h+1)%cap;
		}
		if(arr[h]==key) {
			return ;
		}
		else {
			arr[h]=key;
			return;
		}
	}
	
	void erase(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if(arr[i]==key) {
				arr[i]=-1;
				return;
			}
			i=(i+1)%cap;
			if(i==h) {
				return;
			}
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Open_Addressing obj = new Open_Addressing(7);
		obj.insert(49);
	    obj.insert(56);
	    obj.insert(72);
	    if(obj.search(56)==true){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	    obj.erase(56);
	    if(obj.search(56)==true){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}

}
