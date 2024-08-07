package collection;

import java.util.LinkedList;

public class LinkedlistLastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("Kerala");
		obj.add("Tamilnadu");
		obj.add("Karnataka");
		obj.add("Kerala");
		System.out.println(obj);
		int x=obj.lastIndexOf("Kerala");
		System.out.println(x);
	}

}
