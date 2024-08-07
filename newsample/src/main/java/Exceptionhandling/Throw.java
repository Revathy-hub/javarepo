package Exceptionhandling;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=15;
if(age>=18)
{
	System.out.println("eligible for votting");
}
else
{
	throw new ArithmeticException("Not eligible for votting");
}
	}

}
