package Interface;

public class Interclass2 implements Haiint
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Interclass2 obj=new Interclass2();
	obj.love();
	obj.hate();
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("I LOVE YOU");
	}

	@Override
	public void hate() {
		// TODO Auto-generated method stub
		System.out.println("I HATE YOU");		
	}

}
