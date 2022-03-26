package pkg1;

public class parent1 {
	
	public void defaultmethod()
	{
		this.paramethod3(1, 2, 3);
		System.out.println("Parent default method");
		
	}
	public void paramethod1 (int a)
	{
		this.defaultmethod();
		System.out.println("Parent one parameterized method");
		
	}
		public void paramethod2(int a, int b) 
		{
			this.paramethod1(1);
			System.out.println("Parent two parameterized method");
		
		}
	public void paramethod3(int a , int b, int c)
	{
		System.out.println("Parent three parameterized method");
		
		
	}
		
		
	}


