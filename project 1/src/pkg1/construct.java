package pkg1;

public class construct {

	public construct() {
		this(4,4,4,4);
		System.out.println("Default constructor");
		// TODO Auto-generated constructor stub
	}
	public construct (int a)
	{
		this(3,3,3);
		
		System.out.println("1 Parametrized Consturcor");
	}
	
	public construct(int a ,int b)
	{
	 this();
		System.out.println("2 parameterized Constructor");
	
	 }
	public construct(int a ,int b, int c)
	
	{
		this(2,2);
		System.out.println("3 parameterized Constructor");
	}
	
	public construct (int a, int b, int c, int d) {
		System.out.println("Four parameterized Constructor");
	}
	

	public static void main(String[] args) {
		construct obj=new construct(1);
		
	}
	}

