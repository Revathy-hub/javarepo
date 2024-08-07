package mavenpjt;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0;
		int even=0;
int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
for(int i=0;i<a.length;i++)
{
	if (i%2==0)
	{
	odd=odd+a[i];
}
	else
{
	even=even+a[i];
}
}
System.out.println("sum of even numbers is = "+even);
System.out.println("sum of odd numbers = "+odd);
}

}
