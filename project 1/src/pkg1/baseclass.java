package pkg1;

public class baseclass extends primary
{



public void add()

{
	System.out.println("In Case of inheritance where baseclass inherits primary class");
	System.out.println("baseclass add () method overrides the primary class add() method on calling add() in base class");
}

public void val(int a)
{
	System.out.println("value of a="+a+ " when calling val(int a)");
}

public static void main(String[] args) 
{
	System.out.println("method overriding / dynamic polymorphsim");
	baseclass ob=new baseclass();
	ob.add();
	ob.val(1);
	
}
}