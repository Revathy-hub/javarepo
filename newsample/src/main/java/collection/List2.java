package collection;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("hai");
		obj.add("welcome");
		
		obj.set(1, "black");
		System.out.println(obj);
	}

}
