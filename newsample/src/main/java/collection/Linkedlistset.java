package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("hello");
		obj.add("hai");
		obj.add("welcome");
		
		obj.set(1, "black");
		System.out.println(obj);
	}

}
