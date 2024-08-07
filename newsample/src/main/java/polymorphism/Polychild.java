package polymorphism;

public class Polychild extends Polyparent {
float z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polychild obj1=new Polychild();
		obj1.add(2.3f, 4.5f);
		
	}
public void add(float x,float y)
{
	super.add(10,5);
	 z=x+y;
	System.out.println(z);
}
}
