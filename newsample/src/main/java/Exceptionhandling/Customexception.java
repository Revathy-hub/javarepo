package Exceptionhandling;

public class Customexception {

	public static void main(String[] args) throws VoteException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
int age=15;
if(age>=18)
{
	System.out.println("eligible for votting");
}
else
{
throw new VoteException("Not eligible for votting");
}
	}
}

	


