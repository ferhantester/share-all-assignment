package pkg1;

public class methodcall
{
public void defaultmethod()
{
	System.out.println("Default method");
}
public void para1method(int a)
{
System.out.println("one parametrized method");
}

public void para2method(int a, int b)
{
System.out.println("two parametrized method");	
}
public void para3method(int a, int b, int c)
{
System.out.println("three parametrized method");	

this.defaultmethod();
this.para1method(1);
this.para4method(1, 2, 3, 4);
this.para2method(1,2);
}

public void para4method(int a ,int b, int c, int d)
{
System.out.println("four parametrized method");	
}
public static void main(String[] args) 
{
	System.out.println("Calling one method from another method using this keyword\n");
methodcall obj=new methodcall();
obj.para3method(1,2,3);
}
}
