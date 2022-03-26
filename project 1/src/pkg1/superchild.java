package pkg1;

public class superchild extends parent1
{
	public void superdefaultmethod()
	{
		super.paramethod2(1, 2);
		System.out.println("child default method");
		
		
	}
		public void  superparamethod1 (int a)
		{
		this.superparamethod3(1,2,3);
			
			System.out.println("child 1 parametrized method");
			
		}
		
		public void  superparamethod2(int a,int b)
		{
	this.superparamethod1(1);

			
			System.out.println("child 2 parametrized method");
		}
		
	public void superparamethod3(int a, int b, int c)
	
	{this.superdefaultmethod();
		 System.out.println("child 3 parameterized method");
	}
		public static void main(String[] args)
		{
			System.out.println("Assignment on super keyword\noutput should be in the below sequence");
			
			superchild obj=new superchild();
			obj.superparamethod2(1, 2);
		}
	
	}


