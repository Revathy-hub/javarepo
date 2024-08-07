package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistAddall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("hello");
		obj.add("hai");
		obj.add("welcome");
		
		LinkedList<String>obj1=new LinkedList<String>();

obj1.add("red");
obj1.add("green");

	obj.addAll(obj1);
	System.out.println(obj);
	}

}
