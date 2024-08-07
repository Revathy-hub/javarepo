package Exceptionhandling;

public class exception1 {

	public static void main(String[] args) {

try
{
int a=3;
int b=0;
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException a)
{
System.out.println("check your code");
System.out.println(a);
}
finally
{
	System.out.println("this is finally");
}
}
	}


