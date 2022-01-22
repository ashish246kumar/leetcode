public class OopsExample2 {
String name;
int age;

public OopsExample2(String name,int age )
{
	this.name=name;
	this.age=age;

}
public OopsExample2(OopsExample2 o1)
{
	this.name=o1.name;
	this.age=o1.age;
}

public void getname()
{
	System.out.println("name is"+this.name);
}
public void getage()
{
	System.out.println("age is"+this.age);
	
}
public void getnameAndAge()
{
	System.out.println(this.name+" "+this.age);
	
}
}
public class OopsExample1 {

	public static void main(String[] args) {
		
		OopsExample2 op=new OopsExample2("ram",23);

		OopsExample2 op2=new OopsExample2(op);
		op.getname();
		op.getage();

		op.getnameAndAge();
		op2.getnameAndAge();
	}

}