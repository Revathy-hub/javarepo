package sample;

public class Addition
{

		// TODO Auto-generated method stub
int a;
int b;
int s;
int avg;
	public static void main(String args[]) 
	{
Addition obj=new Addition();
obj.add(10,20);
obj.avarage();
	}	
public void add(int c,int d)
{
	a=c;
	b=d;
	s=c+d;
	System.out.println("sum is ="+s);

}
public void avarage()
{ 
 avg=s/2;
	System.out.println("Avarage ="+avg);
}
	}


