package pkg1;

public class assign1 {
	public int sum (int a, int b)
	{
		int c= a+b;
		System.out.println("Sum of two inputs="+ c );
		
		return c;
		
	}
public int sub (int a, int b)
{
	int c=a-b;
	System.out.println("Second: Substraction of two inputs="+c);
	return c;
	
}
public int multiply(int a, int b)
{
	int c=a*b;
	System.out.println("Third: Multiplication of two inputs="+c);
	return c;
}

public void div(int a, int b)
{
	int c=a/b;
	System.out.println("Final Result=:Division of multiplication result="+c);
	
}
public static void main(String[] args) {
	System.out.println("solve(((((10+2)+2)-2)*2)/2)");
	assign1 simplify=new assign1();
	int sumresult1=simplify.sum(10,2);
	int sumresult2=simplify.sum(sumresult1,2);
	int subresult=simplify.sub(sumresult2,2);
	int multresult=simplify.multiply(subresult,2);
	simplify.div(multresult, 2);
	
	
	
			
}
}
