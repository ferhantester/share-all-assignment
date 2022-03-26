package pkg1;

public class primary

{
	
public 	int a=5 , b=6,d;
	public void add ()
	{
		d=a+b;
		System.out.println("result="+d+" when calling add()");
}
	
	public void add(int a, int b) 
	
	{
		
		d=b-a;
		
		System.out.println("result="+d+" when calling add (int a , int b )  ");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Methor overloading / Static Polymorphism");
		primary c=new primary();
	
		c.add();
		c.add(2,3);
	
	
	}

}