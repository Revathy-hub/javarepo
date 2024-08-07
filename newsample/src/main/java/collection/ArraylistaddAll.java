package collection;

import java.util.ArrayList;

public class ArraylistaddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("hai");
		obj.add("welcome");
		
		ArrayList<String>obj1=new ArrayList<String>();

obj1.add("red");
obj1.add("green");

	obj.addAll(obj1);
	System.out.println(obj);
	}

}
