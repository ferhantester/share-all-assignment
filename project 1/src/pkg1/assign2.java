package pkg1;

public class assign2 {
	public int sum (int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of two inputs="+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("substarction of two inputs="+c);
		return c;
	}
public int div(int a , int b)
{ 
	   int c=a/b;
       System.out.println("divison of two inputs="+c);
         return c;
}
	public void multiply(int a , int b)
	{
		int c=a*b;
		System.out.println("Final result is Multiplication of two inputs="+c);
		
	}
	public static void main(String[] args) {
		System.out.println("solve:((((((10/2)-2)+2)-2)*2)");
		assign2 solve=new assign2();
		int divresult=solve.div(10,2);
		int subresult1=solve.sub(divresult, 2);
		int sumresult=solve.sum(subresult1,2);
		int subresult2=solve.sub(sumresult,2);
		solve.multiply(subresult2,2);
		
	}
}
