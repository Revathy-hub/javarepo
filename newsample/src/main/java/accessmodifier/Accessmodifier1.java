package accessmodifier;

public class Accessmodifier1 {

	public static void main(String[] args) {
		Accessmodifier1 obj=new Accessmodifier1();
		obj.add();
		obj.sub();
		obj.multi();
		obj.diva();
	}
public void add()
{
	System.out.println("This is public");
	}
private void sub()
{
	System.out.println("This is private");
}
protected void multi()
{
	System.out.println("this is protected");
	}
static void diva()
{
	System.out.println("This is default");
}
}

