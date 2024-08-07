package aggregation;

public class Aggregation2cls {
int age;
Aggregation1cls ref;//aggregation reference variable
public Aggregation2cls(int age,Aggregation1cls ref)
{
	this.age=age;
	this.ref=ref;
}
public void display()
{
	System.out.println(ref.name+" "+ref.place);
	System.out.println(age);
	
}

	public static void main(String[] args) {
	
		Aggregation1cls obj1=new Aggregation1cls("devu","poredam");
		Aggregation2cls obj2=new Aggregation2cls(28,obj1);//ref=obj1
		obj2.display();
	}
	}


