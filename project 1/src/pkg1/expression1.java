package pkg1;

import java.util.Scanner;

public class expression1 {
	int c;
	public int sum(int a , int b)
	{
		 c=a+b;
		System.out.println("((x1-x2)+X3)="+c);
		return c;
	}
	public int sub(int a, int b)
	
	{
	 c= a-b;
		System.out.println("(x1-x2)="+c);
		return c;
	}
	public int mul(int a, int b)
	{
		 c=a*b;
		System.out.println("(((((x1-x2)+X3)-x4)*x5)="+c);
		return c;	
	}
	
	public int div( int a ,int b)
	{
		 c=a/b;
		System.out.println("Final result of (((((x1-x2)+X3)-x4)*x5)/x6) = " +c);
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("simplify (((((x1-x2)+X3)-x4)*x5)/x6)\n");
		expression ob= new expression ();
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of x1");
		int x1=s.nextInt();
		System.out.println();
		System.out.println("enter value of x2");
		int x2=s.nextInt();
		ob.sub(x1, x2);
		int d=ob.c;
		System.out.println("enter value of x3");
		int x3=s.nextInt();
		ob.sum(d,x3);
		System.out.println("(x1+x2)-x3)+x4="+ob.c);
		d=ob.c;
		System.out.println("enter value of x4");
		int x4=s.nextInt();
		ob.sub( d,x4);
		System.out.println("(((((x1-x2)+X3)-x4)*x5)/x6)"+ob.c);
		System.out.println("enter value of x5");
		int x5=s.nextInt();
		d=ob.c;
		ob.mul(d, x5);
		System.out.println("enter value of x6");
		int x6=s.nextInt();
		d=ob.c;
		ob.div(d, x6);
			
		
	}

}
