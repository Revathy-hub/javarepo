package Abstract1;

public class Abstract2child extends Abstract2eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract2child obj=new Abstract2child();
		obj.cat();
		obj.dog();
		obj.parrot();
		obj.kitty();
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
	int a=5;
	int b=5;
	int c=a+b;
	System.out.println(c);
	}

	@Override
	public void kitty() {
		// TODO Auto-generated method stub
		System.out.println("hai world");
		
	}

}
