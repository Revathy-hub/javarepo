package sample;

public class Constructoroverloading
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Constructoroverloading obj=new Constructoroverloading(10,30,70);
Constructoroverloading obj1=new Constructoroverloading(20,30);
	}
public Constructoroverloading(int a,int b,int c)
{
	
int s=a+b+c;
System.out.println("sum is :"+ s);
}
public Constructoroverloading(int x,int y)
{
	int z=x+y;
System.out.println(z);
}
}
