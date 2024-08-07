package collection;

import java.util.ArrayList;
import java.util.List;

public class Indexeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("hai");
		obj.add("hello");
		System.out.println(obj);
		int x=obj.indexOf("hello");
		int y=obj.lastIndexOf("hello");
System.out.println(x);
System.out.println(y);
	}

}
