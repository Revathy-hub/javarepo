package collection;

import java.util.ArrayList;
import java.util.List;

public class Removeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("hai");
		obj.add("welcome");
		obj.add("dear");
		obj.add("friend");
		obj.remove("hai");
		obj.remove(0);
		System.out.println(obj);

	}

}
